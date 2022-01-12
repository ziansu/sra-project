@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) {
    if (action.equals("test")) {
        callbackContext.error("Android: Test is not yet implemented!");
        return true;
    }else {
        return false;
    }
}