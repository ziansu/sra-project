public static void stopForegroundDispatch(final android.app.Activity activity, android.nfc.NfcAdapter adapter) {
    adapter.disableForegroundDispatch(activity);
}