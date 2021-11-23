@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
    time.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    time.set(java.util.Calendar.MINUTE, minute);
    textView.setText(android.text.format.DateUtils.formatDateTime(this, time.getTimeInMillis(), tcd.training.com.calendar.AddEventTask.AddEventActivity.TIME_FORMAT_FLAGS));
}