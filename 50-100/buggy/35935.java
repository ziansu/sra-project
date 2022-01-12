private void readLibrary(org.json.JSONObject options, org.apache.cordova.CallbackContext callbackContext) {
    android.os.Looper.prepare();
    try {
        org.json.JSONArray results = readMediaLibrary(options);
        callbackContext.success(results);
    } catch (org.json.JSONException e) {
        callbackContext.error(e.getMessage());
        e.printStackTrace();
    } finally {
        android.os.Looper.myLooper().quit();
    }
}