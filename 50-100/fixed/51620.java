public static void sendJavascript(org.json.JSONObject _json) {
    java.lang.String _d = ((("javascript:" + (com.plugin.gcm.PushPlugin.gECB)) + "(") + (_json.toString())) + ")";
    if (((com.plugin.gcm.PushPlugin.gECB) != null) && ((com.plugin.gcm.PushPlugin.gWebView) != null)) {
        com.plugin.gcm.PushPlugin.gWebView.sendJavascript(_d);
    }
}