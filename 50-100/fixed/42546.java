public static org.json.JSONObject bundleToJSON(android.os.Bundle bundle) {
    org.json.JSONObject json = new org.json.JSONObject();
    if ((bundle == null) || (bundle.isEmpty())) {
        return json;
    }
    java.util.Set<java.lang.String> keys = bundle.keySet();
    for (java.lang.String key : keys) {
        try {
            json.put(key, bundle.get(key));
        } catch (org.json.JSONException e) {
            android.util.Log.e(com.phonemap.phonemap.utils.Utils.LOG_TAG, "Cannot create JSONObject out of provided bundle");
        }
    }
    return json;
}