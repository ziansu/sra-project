@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int hour = mTimePicker.getHour();
    int minute = mTimePicker.getMinute();
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(java.util.Calendar.HOUR_OF_DAY, hour);
    calendar.set(java.util.Calendar.MINUTE, minute);
    java.util.Date time = calendar.getTime();
    sendResult(Activity.RESULT_OK, time);
}