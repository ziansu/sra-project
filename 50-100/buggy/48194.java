@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    long value = getArguments().getLong(getString(R.string.timeInMilis));
    final java.util.Calendar c = java.util.Calendar.getInstance();
    c.setTimeInMillis(value);
    int hours = c.get(java.util.Calendar.HOUR_OF_DAY);
    int min = c.get(java.util.Calendar.MINUTE);
    return new android.app.TimePickerDialog(getActivity(), this, min, hours, true);
}