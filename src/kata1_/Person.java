package kata1_;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private static final int MS_PER_SECOND = 1000;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final double DAYS_PER_YEAR = 365.25;
    private static final double MS_PER_YEAR = SECONDS_PER_MINUTE * MS_PER_SECOND * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;


    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        long ms = new Date().getTime()- birthday.getTime();
        return toYears(ms);
    }
    private int toYears (long ms) {
        return (int) ((int) (ms)/ MS_PER_YEAR);              
    }
    
    @Override
    public 
    
    

}
