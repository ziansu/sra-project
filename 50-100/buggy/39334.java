public static java.util.Calendar getNewInstanceZeroedCalendarForTimezone(java.util.TimeZone timeZone) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTimeZone(timeZone);
    cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
    cal.set(java.util.Calendar.MINUTE, 0);
    cal.set(java.util.Calendar.SECOND, 0);
    cal.set(java.util.Calendar.MILLISECOND, 0);
    return cal;
}