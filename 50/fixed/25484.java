@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hour, int minute) {
    hourOfDay = hour;
    minuteOfDay = minute;
    setAlarm();
}