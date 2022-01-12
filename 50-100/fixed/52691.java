@java.lang.Override
protected android.app.Dialog onCreateDialog(int id) {
    if (id == 999) {
        return new android.app.DatePickerDialog(this, myStartDateListener, year, month, day);
    }
    if (id == 1) {
        return new android.app.TimePickerDialog(this, myFromTimeListener, hour, min, true);
    }
    return null;
}