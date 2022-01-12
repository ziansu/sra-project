@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    final java.util.Calendar c = java.util.Calendar.getInstance();
    int year = c.get(java.util.Calendar.YEAR);
    int month = c.get(java.util.Calendar.MONTH);
    int day = c.get(java.util.Calendar.DAY_OF_MONTH);
    date = "";
    return new android.app.DatePickerDialog(getActivity(), this, year, month, day);
}