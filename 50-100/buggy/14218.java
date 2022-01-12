@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    final java.util.Calendar cal = java.util.Calendar.getInstance();
    int year = cal.get(java.util.Calendar.YEAR);
    int month = (cal.get(java.util.Calendar.MONTH)) + 1;
    int day = cal.get(java.util.Calendar.DAY_OF_MONTH);
    listener = ((com.burstlinker.budget.DatePickerFragment.TheListener) (getActivity()));
    return new android.app.DatePickerDialog(getActivity(), this, year, month, day);
}