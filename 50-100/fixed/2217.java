public boolean execute(final java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    com.cordova.plugin.android.fingerprintauth.FingerprintAuth.mCallbackContext = callbackContext;
    if ((android.os.Build.VERSION.SDK_INT) < 23) {
        java.lang.String errorMessage = createErrorMessage(com.cordova.plugin.android.fingerprintauth.FingerprintAuth.NO_HARDWARE_CODE, com.cordova.plugin.android.fingerprintauth.FingerprintAuth.NO_HARDWARE_MESSAGE);
        com.cordova.plugin.android.fingerprintauth.FingerprintAuth.mPluginResult = new org.apache.cordova.PluginResult(PluginResult.Status.ERROR, errorMessage);
        com.cordova.plugin.android.fingerprintauth.FingerprintAuth.mCallbackContext.sendPluginResult(com.cordova.plugin.android.fingerprintauth.FingerprintAuth.mPluginResult);
        return true;
    }
    if ((mFingerprintAuthAux) == null) {
        mFingerprintAuthAux = new com.cordova.plugin.android.fingerprintauth.FingerprintAuthAux(this);
    }
    return mFingerprintAuthAux.execute(action, args, callbackContext, cordova);
}