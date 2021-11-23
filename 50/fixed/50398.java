public static long nanosFromDate(long ms) {
    java.util.Calendar cal = org.h2.util.DateTimeUtils.getCalendar();
    cal.setTimeInMillis(ms);
    return org.h2.util.DateTimeUtils.nanosFromCalendar(cal);
}