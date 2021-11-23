@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
    java.util.Calendar date = ((textView.getId()) == (R.id.tv_start_time)) ? mStart : mEnd;
    date.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    date.set(java.util.Calendar.MINUTE, minute);
    textView.setText(android.text.format.DateUtils.formatDateTime(this, date.getTimeInMillis(), tcd.training.com.calendar.AddEventTask.AddEventActivity.TIME_FORMAT_FLAGS));
}