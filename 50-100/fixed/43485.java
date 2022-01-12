@java.lang.Override
public void onDateSet(com.codetroopers.betterpickers.calendardatepicker.CalendarDatePickerDialogFragment dialog, int year, int monthOfYear, int dayOfMonth) {
    if (isDateValid(event, year, monthOfYear, dayOfMonth)) {
        event.setDate(getDateFromDatePicker(event, year, monthOfYear, dayOfMonth));
        dateButton.setText(event.getStringDate());
    }else {
        android.widget.Toast.makeText(this, getString(R.string.msg_error_time_date_input), Toast.LENGTH_LONG).show();
    }
}