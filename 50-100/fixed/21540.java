public static void currentCalendar(java.lang.String userName, java.lang.String calendarName) {
    java.util.Calendar juc = java.util.Calendar.getInstance(controllers.Application.getLocale());
    juc.setTime(new java.util.Date());
    controllers.Application.selectedDay = juc.get(java.util.Calendar.DAY_OF_MONTH);
    controllers.Application.selectedMonth = juc.get(java.util.Calendar.MONTH);
    controllers.Application.selectedYear = juc.get(java.util.Calendar.YEAR);
    controllers.Application.calendar(userName, calendarName, null, (-1));
}