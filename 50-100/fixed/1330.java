@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hour, int min) {
    timeList.add((((((" " + (hour < 10 ? '0' : "")) + hour) + ":") + (min < 10 ? '0' : "")) + min));
    showOnScreen();
}