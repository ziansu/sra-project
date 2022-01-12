@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    if (action.equals("get")) {
        java.lang.String uri = args.getString(0);
        android.net.Uri contentUri = android.net.Uri.parse(uri);
        this.getPath(callbackContext, contentUri);
        return true;
    }
    return false;
}