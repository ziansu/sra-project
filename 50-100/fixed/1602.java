@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    long timestamp = getArguments().getLong("date");
    calendar = new java.util.GregorianCalendar();
    calendar.setTime(new java.util.Date(timestamp));
    int hour = calendar.get(java.util.Calendar.HOUR_OF_DAY);
    int minute = calendar.get(java.util.Calendar.MINUTE);
    return new android.app.TimePickerDialog(getActivity(), this, hour, minute, true);
}