@java.lang.Override
public void onTimeSet(com.codetroopers.betterpickers.radialtimepicker.RadialTimePickerDialogFragment dialog, int hourOfDay, int minute) {
    if (isTimeValid(event, hourOfDay, minute)) {
        event.setDate(getDateFromTimePicker(hourOfDay, minute));
        timeButton.setText(event.getStringTime());
    }else {
        android.widget.Toast.makeText(this, getString(R.string.msg_error_time_date_input), Toast.LENGTH_LONG).show();
    }
}