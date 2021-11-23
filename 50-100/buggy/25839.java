@java.lang.Override
public void onSelectDate(java.util.Date date, android.view.View view) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(date);
    com.fitgoose.fitgoosedemo.MyDate myDate = new com.fitgoose.fitgoosedemo.MyDate();
    myDate.setFromCalendar(calendar);
    com.fitgoose.fitgoosedemo.utilities.CalendarDialog calendarDialog = new com.fitgoose.fitgoosedemo.utilities.CalendarDialog(getApplicationContext(), myDate);
    calendarDialog.show();
}