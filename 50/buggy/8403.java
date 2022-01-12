public static void recordAlert(org.json.JSONObject jmessage) {
    de.xavaro.android.common.Json.put(jmessage, "priority", "alertinfo");
    de.xavaro.android.common.ActivityManager.getInstance().onMessage(jmessage, false);
}