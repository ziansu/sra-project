@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    final java.util.Calendar c = ((java.util.Calendar) (getArguments().getSerializable("initDate")));
    int year = c.get(java.util.Calendar.YEAR);
    int month = c.get(java.util.Calendar.MONTH);
    int day = c.get(java.util.Calendar.DAY_OF_MONTH);
    return new android.app.DatePickerDialog(getActivity(), onDateSet, year, month, day);
}