public void onClick(com.example.utente.calcolaorauscita.DialogInterface dialog, int which) {
    if (which == (DialogInterface.BUTTON_NEGATIVE)) {
        timePickerChoseTime = false;
        android.util.Log.v("", "Annullato il timepicker");
    }
}