protected void onDayTapped(com.henry.calendarview.SimpleMonthAdapter.CalendarDay calendarDay) {
    mController.onDayOfMonthSelected(calendarDay);
    setRangeSelectedDay(calendarDay);
}