@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
    mCalendar.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    mCalendar.set(java.util.Calendar.MINUTE, minute);
    updateTime(mCalendar);
}