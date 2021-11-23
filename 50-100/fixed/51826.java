private void showTimeDialog() {
    int hour = prefs.getInt(getString(R.string.pref_timepicker_hour), R.string.pref_timepicker_hour_default);
    int minute = prefs.getInt(getString(R.string.pref_timepicker_minutes), R.string.pref_timepicker_minutes_default);
    android.app.TimePickerDialog mTimePicker;
    mTimePicker = new android.app.TimePickerDialog(this, this, hour, minute, false);
    mTimePicker.setTitle(getString(R.string.timepicker_title));
    mTimePicker.show();
}