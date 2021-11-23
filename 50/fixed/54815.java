public static java.lang.String recordActivity(java.lang.String message) {
    org.json.JSONObject jmessage = new org.json.JSONObject();
    de.xavaro.android.common.Json.put(jmessage, "message", message);
    return de.xavaro.android.common.ActivityManager.recordActivity(jmessage);
}