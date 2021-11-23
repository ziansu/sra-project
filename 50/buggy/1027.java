public static void viewNextMonth(java.lang.Long calendarId, java.util.Date currentDate) {
    controllers.Calendars.putCalendarData(calendarId, currentDate);
    controllers.Calendars.viewCalendar(calendarId, new org.joda.time.DateTime(currentDate).plusMonths(1).toDate());
}