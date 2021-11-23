@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    java.lang.String am_pm = "";
    if (hourOfDay > 12) {
        hourOfDay = hourOfDay - 12;
        am_pm = "PM";
    }else {
        am_pm = "AM";
    }
    if (hourOfDay == 0)
        hourOfDay = hourOfDay + 12;
    
    b.setText(((((hourOfDay + ":") + (java.lang.String.format("%02d", minute))) + "  ") + am_pm));
}