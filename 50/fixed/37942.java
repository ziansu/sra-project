@java.lang.Override
protected void onPause() {
    com.imperium.power.nfcmango.NFCScreen.stopForegroundDispatch(this, mNfcAdapter);
    super.onPause();
}