@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    yearFinal = year;
    monthFinal = month;
    dayFinal = dayOfMonth;
    java.util.Calendar c = java.util.Calendar.getInstance();
    hour = c.get(java.util.Calendar.HOUR_OF_DAY);
    minute = c.get(java.util.Calendar.MINUTE);
    android.app.TimePickerDialog timePickerDialog = new android.app.TimePickerDialog(this, this, hour, minute, android.text.format.DateFormat.is24HourFormat(this));
    timePickerDialog.show();
}