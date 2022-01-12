@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    final java.util.Calendar c = java.util.Calendar.getInstance();
    int hour = c.get(java.util.Calendar.HOUR_OF_DAY);
    int minute = c.get(java.util.Calendar.MINUTE);
    hourOfDay = "";
    return new android.app.TimePickerDialog(getActivity(), this, hour, minute, android.text.format.DateFormat.is24HourFormat(getActivity()));
}