@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    final java.util.Calendar c = java.util.Calendar.getInstance();
    if ((com.ferit.dfundak.georeminder.AddNewItem.year) == 0) {
        com.ferit.dfundak.georeminder.AddNewItem.year = c.get(java.util.Calendar.YEAR);
        com.ferit.dfundak.georeminder.AddNewItem.month = c.get(java.util.Calendar.MONTH);
        com.ferit.dfundak.georeminder.AddNewItem.day = c.get(java.util.Calendar.DAY_OF_MONTH);
    }
    android.app.DatePickerDialog dialog = new android.app.DatePickerDialog(getActivity(), this, com.ferit.dfundak.georeminder.AddNewItem.year, com.ferit.dfundak.georeminder.AddNewItem.month, com.ferit.dfundak.georeminder.AddNewItem.day);
    dialog.getDatePicker().setMinDate(c.getTimeInMillis());
    return dialog;
}