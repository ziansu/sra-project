@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callback) throws org.json.JSONException {
    this.command = callback;
    if ("open".equals(action)) {
        open(args);
        return true;
    }
    if ("isAvailable".equals(action)) {
        isAvailable();
        return true;
    }
    return false;
}