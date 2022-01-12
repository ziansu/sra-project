private org.apache.cordova.PluginResult convertToPluginResult(com.google.firebase.database.DatabaseError error, boolean reusable) {
    org.json.JSONObject data = null;
    try {
        data.put("code", error.getCode());
        data.put("message", error.getMessage());
        data.put("details", error.getDetails());
    } catch (org.json.JSONException e) {
    }
    org.apache.cordova.PluginResult result = new org.apache.cordova.PluginResult(PluginResult.Status.ERROR, data);
    result.setKeepCallback(reusable);
    return result;
}