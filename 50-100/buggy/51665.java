public fr.ralala.worktime.models.WorkTimeDay fromTimeUsingCalendar(long hours, long minutes) {
    year = month = day = 0;
    java.util.Calendar ctime = java.util.Calendar.getInstance();
    ctime.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
    ctime.setTime(new java.util.Date(java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes)));
    this.hours = ((int) (hours + (ctime.get(java.util.Calendar.HOUR))));
    this.minutes = ctime.get(java.util.Calendar.MINUTE);
    return this;
}