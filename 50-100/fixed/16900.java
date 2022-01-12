@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    java.util.Calendar c = ((java.util.Calendar) (getArguments().getSerializable("initDate")));
    if (c == null) {
        c = java.util.Calendar.getInstance();
    }
    int year = c.get(java.util.Calendar.YEAR);
    int month = c.get(java.util.Calendar.MONTH);
    int day = c.get(java.util.Calendar.DAY_OF_MONTH);
    return new android.app.DatePickerDialog(getActivity(), onDateSet, year, month, day);
}