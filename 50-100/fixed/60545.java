private void eraseTag(com.chariotsolutions.nfc.plugin.CallbackContext callbackContext) throws org.json.JSONException {
    android.nfc.Tag tag = savedTag;
    if (!(inReaderMode)) {
        tag = savedIntent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
    }
    android.nfc.NdefRecord[] records = new android.nfc.NdefRecord[]{ new android.nfc.NdefRecord(android.nfc.NdefRecord.TNF_EMPTY, new byte[0], new byte[0], new byte[0]) };
    writeNdefMessage(new android.nfc.NdefMessage(records), tag, callbackContext);
}