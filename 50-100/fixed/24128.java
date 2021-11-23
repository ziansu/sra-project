@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    final java.util.Calendar c = java.util.Calendar.getInstance();
    int hour = c.get(java.util.Calendar.HOUR_OF_DAY);
    int minute = c.get(java.util.Calendar.MINUTE);
    return new android.app.TimePickerDialog(getActivity(), this, hour, minute, true);
}