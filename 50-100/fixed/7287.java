@java.lang.Override
public void onTimeChanged(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
    super.onTimeChanged(timePicker, hourOfDay, minute);
    if (!(mIgnoreEvent)) {
        minute = getRoundedMinute(minute);
        mIgnoreEvent = true;
        timePicker.setCurrentMinute(minute);
        mIgnoreEvent = false;
    }
}