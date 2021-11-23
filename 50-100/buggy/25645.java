private void writeTag(org.json.JSONArray data, com.chariotsolutions.nfc.plugin.CallbackContext callbackContext) throws org.json.JSONException {
    if ((getIntent()) == null) {
        callbackContext.error("Failed to write tag, received null intent");
    }
    if (inReaderMode) {
        android.nfc.Tag tag = savedTag;
    }else {
        android.nfc.Tag tag = savedIntent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
    }
    android.nfc.NdefRecord[] records = com.chariotsolutions.nfc.plugin.Util.jsonToNdefRecords(data.getString(0));
    writeNdefMessage(new android.nfc.NdefMessage(records), tag, callbackContext);
}