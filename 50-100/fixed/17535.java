@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    if (action.equals("coolMethod")) {
        java.lang.String message = args.getString(0);
        this.coolMethod(message, callbackContext);
        return true;
    }
    return false;
}