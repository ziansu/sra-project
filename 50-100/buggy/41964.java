@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    beginDate = java.util.Calendar.getInstance();
    beginDate.set(java.util.Calendar.YEAR, year);
    beginDate.set(java.util.Calendar.MONTH, month);
    beginDate.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("MM/dd/yy");
    etDate.setText(dateFormat.format(beginDate.getTime()));
}