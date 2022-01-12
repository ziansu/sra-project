@java.lang.Override
protected void onResume() {
    super.onResume();
    com.imperium.power.nfcmango.NFCScreen.setupForegroundDispatch(this, mNfcAdapter);
}