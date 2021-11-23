public void setDailySleepTime(int hourOfDay, int minute) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
    calendar.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    calendar.set(java.util.Calendar.MINUTE, minute);
    calendar.set(java.util.Calendar.SECOND, 0);
    if ((calendar.getTimeInMillis()) <= (java.lang.System.currentTimeMillis())) {
        calendar.add(java.util.Calendar.DATE, 1);
    }
    mSleepTime = new org.joda.time.DateTime(calendar.getTimeInMillis());
}