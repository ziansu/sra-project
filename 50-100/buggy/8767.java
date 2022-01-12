public static com.ldf.calendar.model.CalendarDate fromDate(java.util.Date date) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(date);
    com.ldf.calendar.model.CalendarDate calendarDate = new com.ldf.calendar.model.CalendarDate();
    calendarDate.year = cal.get(java.util.Calendar.YEAR);
    calendarDate.month = cal.get(((java.util.Calendar.MONTH) + 1));
    calendarDate.day = cal.get(java.util.Calendar.DAY_OF_MONTH);
    return calendarDate;
}