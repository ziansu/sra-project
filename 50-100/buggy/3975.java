public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    boolean result;
    try {
        if (action.equals("request")) {
            result = request(args.getInt(0));
            context = callbackContext;
        }else {
            handleError("Invalid action", cordova.plugin.RequestLocationAccuracy.ERROR_INVALID_ACTION);
            result = false;
        }
    } catch (java.lang.Exception e) {
        handleError(e.getMessage(), cordova.plugin.RequestLocationAccuracy.ERROR_EXCEPTION);
        result = false;
    }
    return result;
}