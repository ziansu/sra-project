private void init(com.chariotsolutions.nfc.plugin.CallbackContext callbackContext) {
    android.util.Log.d(com.chariotsolutions.nfc.plugin.NfcPlugin.TAG, ("Enabling plugin " + (getIntent())));
    startNfc();
    if (inReaderMode) {
        if ((savedTag) != null) {
            handleTag();
        }
    }else
        if (!(recycledIntent())) {
            parseMessage();
        }
    
    callbackContext.success();
}