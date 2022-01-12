public void setDate(java.util.Date date) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(java.util.Calendar.HOUR_OF_DAY, 1);
    calendar.set(java.util.Calendar.MINUTE, 0);
    calendar.set(java.util.Calendar.SECOND, 0);
    calendar.set(java.util.Calendar.MILLISECOND, 0);
    date = calendar.getTime();
    this.date = date;
}