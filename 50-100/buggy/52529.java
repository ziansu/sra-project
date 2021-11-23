public void scrollCalendarToDate(java.util.Date date) {
    gregorianCalendar.setTime(date);
    int year = gregorianCalendar.get(java.util.Calendar.YEAR);
    int month = gregorianCalendar.get(java.util.Calendar.MONTH);
    java.lang.String key = calendarKeyFormatter(year, month);
    outlookchallenge.jmduque.com.outlookandroidengineerchallenge.models.CalendarMonth calendarMonth = calendarItemsMap.get(key);
    if (calendarMonth == null) {
        return ;
    }
    setTitle(calendarMonth.getMonthName());
    calendar.scrollToPosition(calendarItems.indexOf(calendarMonth));
}