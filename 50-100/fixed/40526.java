@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    java.util.Calendar c = ((java.util.Calendar) (getArguments().getSerializable("initTime")));
    if (c == null) {
        c = java.util.Calendar.getInstance();
    }
    int hour = c.get(java.util.Calendar.HOUR_OF_DAY);
    int minute = c.get(java.util.Calendar.MINUTE);
    return new android.app.TimePickerDialog(getActivity(), onTimeSet, hour, minute, false);
}