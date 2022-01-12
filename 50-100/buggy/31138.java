@java.lang.Override
public boolean execute(java.lang.String action, org.apache.cordova.CordovaArgs args, final org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    if ("unzip".equals(action)) {
        unzip(args, callbackContext);
        return true;
    }else
        if ("zip".equals(action)) {
            zip(args, callbackContext);
        }
    
    return false;
}