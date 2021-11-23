public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    java.lang.String hourS = "";
    java.lang.String minuteS = "";
    if (hourOfDay < 10) {
        hourS = "0" + hourOfDay;
    }
    if (minute < 10) {
        minuteS = "0" + minute;
    }
    edu.neu.madcourse.priyankabh.note2map.SelectEventTimeActivity.startTime.setText(new java.lang.StringBuilder().append(hourS).append(" : ").append(minuteS));
}