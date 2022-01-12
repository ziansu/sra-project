private static java.util.Date setTimeToEndOfDay(java.util.Date date) {
    assert date != null;
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(java.util.Calendar.HOUR_OF_DAY, 23);
    calendar.set(java.util.Calendar.MINUTE, 59);
    calendar.set(java.util.Calendar.SECOND, 59);
    java.util.Date updatedDate = calendar.getTime();
    return updatedDate;
}