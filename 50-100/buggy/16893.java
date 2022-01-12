public static long roundDown(long time) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTimeInMillis(time);
    calendar.set(java.util.Calendar.HOUR_OF_DAY, 0);
    calendar.set(java.util.Calendar.MINUTE, 0);
    calendar.set(java.util.Calendar.SECOND, 0);
    calendar.set(java.util.Calendar.MILLISECOND, 0);
    long newTime = calendar.getTimeInMillis();
    return (newTime - (newTime % 1000)) + (com.ifthenelse.ejmoore2.agenda.util.DatetimeUtils.ONE_MINUTE);
}