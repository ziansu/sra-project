@java.lang.Override
public void onTimeChanged(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
    super.onTimeChanged(timePicker, hourOfDay, minute);
    if (!(mIgnoreEvent)) {
        minute = com.plugin.datepicker.DatePickerPlugin.CustomTimePickerDialog.getRoundedMinute(minute);
        mIgnoreEvent = true;
        timePicker.setCurrentMinute(minute);
        mIgnoreEvent = false;
    }
}