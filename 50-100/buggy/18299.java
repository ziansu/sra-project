@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callback) throws org.json.JSONException {
    this.command = callback;
    if ("open".equalsIgnoreCase(action)) {
        open(args);
        return true;
    }
    if ("isAvailable".equalsIgnoreCase(action)) {
        isAvailable(args.getString(0));
        return true;
    }
    return false;
}