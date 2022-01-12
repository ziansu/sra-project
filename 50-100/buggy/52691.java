@java.lang.Override
protected android.app.Dialog onCreateDialog(int id) {
    if (id == 999) {
        return new android.app.DatePickerDialog(this, myStartDateListener, year, month, day);
    }
    boolean is24HourFormat = true;
    if (id == 1) {
        return new android.app.TimePickerDialog(this, myFromTimeListener, hour, min, is24HourFormat);
    }
    return null;
}