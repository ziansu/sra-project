@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    hour = hourOfDay;
    mins = minute;
    if (v == (startTime)) {
        startTimeStr = (((hour) + ":") + (mins)) + ":00";
    }else
        if (v == (endTime)) {
            endTimeStr = (((hour) + ":") + (mins)) + ":00";
        }
    
}