private void nextMonth() {
    if ((cal.get(java.util.Calendar.MONTH)) == (java.util.Calendar.DECEMBER)) {
        cal.set(((cal.get(java.util.Calendar.YEAR)) + 1), java.util.Calendar.JANUARY, 1);
    }else {
        cal.set(java.util.Calendar.MONTH, ((cal.get(java.util.Calendar.MONTH)) + 1));
        cal.set(java.util.Calendar.DAY_OF_MONTH, 1);
    }
    drawCalendarAndDayDetails();
    mAdapter = new com.pschuette.android.calendarlibrary.CalendarAdapter(context, cal);
}