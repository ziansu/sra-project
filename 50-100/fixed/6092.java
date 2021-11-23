@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hour, int minute) {
    c.set(java.util.Calendar.HOUR_OF_DAY, hour);
    c.set(java.util.Calendar.MINUTE, minute);
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("hh:mm a");
    btnFragTime.setText(dateFormat.format(c.getTime()));
}