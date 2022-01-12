@java.lang.Override
public void onClick(android.view.View v) {
    android.app.DatePickerDialog dialog = new android.app.DatePickerDialog(this, dateNotificacao, calendarNotificacao.get(java.util.Calendar.YEAR), calendarNotificacao.get(java.util.Calendar.MONTH), calendarNotificacao.get(java.util.Calendar.DAY_OF_MONTH));
    dialog.getDatePicker().setMaxDate(calendarTarefa.getTimeInMillis());
    dialog.show();
}