private void enableNfcPayment() {
    mNfcUtils.enableDispatch();
    if (!(com.example.marco.nokket.utils.NFCUtils.isNfcAvailable(getApplicationContext()))) {
        android.widget.Toast.makeText(this, "NFC not available", Toast.LENGTH_LONG).show();
        enableNfcFailed();
    }else
        if (!(com.example.marco.nokket.utils.NFCUtils.isNfcEnabled(getApplicationContext()))) {
            android.widget.Toast.makeText(this, "NFC not enabled", Toast.LENGTH_LONG).show();
            enableNfcFailed();
        }else {
            enableNfcSuccess();
        }
    
}