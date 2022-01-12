private static java.util.Date setTimeToStartOfDay(java.util.Date date) {
    assert date != null;
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(java.util.Calendar.HOUR_OF_DAY, 0);
    calendar.set(java.util.Calendar.MINUTE, 0);
    calendar.set(java.util.Calendar.SECOND, 0);
    java.util.Date updatedDate = calendar.getTime();
    return updatedDate;
}