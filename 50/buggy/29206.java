public void onClick(com.example.utente.calcolaorauscita.DialogInterface dialog, int which) {
    if (which == (DialogInterface.BUTTON_POSITIVE)) {
        timePickerChoseTime = true;
        android.util.Log.v("", "Impostato il timepicker");
    }
}