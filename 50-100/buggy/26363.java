@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, final uk.co.onefile.nomadionic.filepicker.CallbackContext callbackContext) throws org.json.JSONException {
    if (action.equals("pickFile")) {
        final org.json.JSONObject config = args.getJSONObject(0);
        cordova.getThreadPool().execute(new java.lang.Runnable() {
            public void run() {
                picker(config, callbackContext);
            }
        });
        return true;
    }
    return false;
}