protected android.app.Dialog onCreateDialog(int id) {
    switch (id) {
        case com.example.migraineapp.SleepActivity.time_dialog_id_1 :
            return new android.app.TimePickerDialog(this, startTimeSetListener, hour, minute, true);
        case com.example.migraineapp.SleepActivity.time_dialog_id_2 :
            return new android.app.TimePickerDialog(this, endTimeSetListener, hour, minute, true);
            return null;
    }
}