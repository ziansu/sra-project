@java.lang.Override
public void onMonthChanged(com.prolificinteractive.materialcalendarview.MaterialCalendarView widget, com.prolificinteractive.materialcalendarview.CalendarDay date) {
    getSupportActionBar().setTitle(com.jasperwong.smartbicycle.activity.UserActivity.FORMATTER.format(date.getDate()));
}