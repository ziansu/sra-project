protected void onDayTapped(com.henry.calendarview.SimpleMonthAdapter.CalendarDay calendarDay) {
    if ((mController) != null) {
        mController.onDayOfMonthSelected(calendarDay);
    }
    setRangeSelectedDay(calendarDay);
}