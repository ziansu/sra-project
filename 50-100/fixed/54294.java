@java.lang.Override
public boolean execute(java.lang.String action, com.radlib.cordova.CordovaArgs args, com.radlib.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    if (action.equals("scan")) {
        scanNearbyBluetooth(callbackContext);
        return true;
    }else
        if (action.equals("stop")) {
            stop();
            callbackContext.success("success stop");
            return true;
        }
    
    callbackContext.error("did not not work");
    return false;
}