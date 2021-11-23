@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, final org.apache.cordova.CallbackContext CallbackContext) throws org.json.JSONException {
    if (action.equals("scan")) {
        byte[] capturedByteData = captureFingerPrint();
        final org.apache.cordova.PluginResult result = new org.apache.cordova.PluginResult(org.apache.cordova.PluginResult.Status.OK, capturedByteData);
        callbackContext.sendPluginResult(result);
    }
    return true;
}