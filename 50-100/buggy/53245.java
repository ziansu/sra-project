public static int currentDay() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    int day = calendar.get(java.util.Calendar.DAY_OF_WEEK);
    if ((calendar.get(java.util.Calendar.HOUR_OF_DAY)) > 17)
        day += 1;
    
    if ((day == (java.util.Calendar.SATURDAY)) || (day == (java.util.Calendar.SUNDAY)))
        day = java.util.Calendar.MONDAY;
    
    return day;
}