@java.lang.Override
public void onClick(android.view.View v) {
    java.util.Calendar date = java.util.Calendar.getInstance();
    date.setTime(mDate);
    android.app.DatePickerDialog dialog = new android.app.DatePickerDialog(this, mDateListener, date.get(java.util.Calendar.YEAR), date.get(java.util.Calendar.MONTH), date.get(java.util.Calendar.DAY_OF_MONTH));
    dialog.show();
}