@java.lang.Override
public void onClick(android.view.View view) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    new android.app.DatePickerDialog(context, dateSetListener, cal.get(java.util.Calendar.YEAR), ((cal.get(java.util.Calendar.MONTH)) + 1), cal.get(java.util.Calendar.DAY_OF_MONTH));
}