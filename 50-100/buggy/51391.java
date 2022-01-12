public static void recordActivity(java.lang.String message, int iconres) {
    org.json.JSONObject jmessage = new org.json.JSONObject();
    de.xavaro.android.common.Json.put(jmessage, "message", message);
    de.xavaro.android.common.Json.put(jmessage, "iconres", iconres);
    de.xavaro.android.common.ActivityManager.recordActivity(jmessage);
}