public void onDateSet(android.widget.DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {
    java.util.Calendar newDate = java.util.Calendar.getInstance();
    newDate.set(selectedyear, selectedmonth, selectedday);
    editStartDate.setText(((((selectedday + "/") + selectedmonth) + "/") + selectedyear));
}