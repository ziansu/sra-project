@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    Hour = hourOfDay;
    Minute = minute;
    DateSelector.setText(java.lang.String.format(java.util.Locale.ENGLISH, "%d-%d-%d %02d:%02d", Year, ((Month) + 1), Day, Hour, Minute));
    t_time = componentTimeToTimestamp(Year, ((Month) + 1), Day, Hour, Minute);
}