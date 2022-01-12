public java.util.Calendar getDayCalendar(int year, int month, int day) {
    java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("GMT+8:00"));
    calendar.set(year, month, day);
    return calendar;
}