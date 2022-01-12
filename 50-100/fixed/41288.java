public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) {
    this.callbackContext = callbackContext;
    if (action.equals("scan")) {
        startScan();
        return true;
    }
    if (action.equals("receive")) {
        sendUpdate(lastBarcode, true);
        return true;
    }
    return false;
}