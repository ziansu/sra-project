protected void onDayTapped(com.andexert.calendarlistview.library.SimpleMonthAdapter.CalendarDay calendarDay) {
    setSelectedDay(calendarDay);
    mController.onDayOfMonthSelected(calendarDay.year, calendarDay.month, calendarDay.day);
}