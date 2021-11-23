public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    java.lang.String hourS = "";
    java.lang.String minuteS = "";
    if (hourOfDay < 10) {
        hourS = "0" + hourOfDay;
    }else {
        hourS = hourS + hourOfDay;
    }
    if (minute < 10) {
        minuteS = "0" + minute;
    }else {
        minuteS = minuteS + minute;
    }
    edu.neu.madcourse.priyankabh.note2map.SelectEventTimeActivity.startTime.setText(new java.lang.StringBuilder().append(hourS).append(" : ").append(minuteS));
}