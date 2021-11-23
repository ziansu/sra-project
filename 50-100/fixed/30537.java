@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    com.ly.badiane.budgetmanager_finalandroidproject.vues.TransactionActivity.datePicker.setText(((((day + "/") + (month + 1)) + "/") + year));
    java.util.GregorianCalendar calendarToday = new java.util.GregorianCalendar();
    java.util.GregorianCalendar datePicked = new java.util.GregorianCalendar();
    datePicked.set(year, month, day);
}