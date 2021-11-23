public static void recordAlert(java.lang.String message, java.lang.String mediapath) {
    org.json.JSONObject jmessage = new org.json.JSONObject();
    de.xavaro.android.common.Json.put(jmessage, "message", message);
    de.xavaro.android.common.Json.put(jmessage, "mediapath", mediapath);
    de.xavaro.android.common.ActivityManager.recordAlert(jmessage);
}