private void logError(org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    try {
        com.flurry.android.FlurryAgent.onError(args.getString(0), args.getString(1), new java.lang.Exception(args.getString(1)));
        callbackContext.success();
    } catch (java.lang.Exception e) {
        callbackContext.error(e.getMessage());
    }
}