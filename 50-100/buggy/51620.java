public static void sendJavascript(org.json.JSONObject _json) {
    java.lang.String _d = ((("javascript:" + (com.plugin.gcm.PushPlugin.gECB)) + "(") + (_json.toString())) + ")";
    android.util.Log.v(com.plugin.gcm.PushPlugin.TAG, ("sendJavascript: " + _d));
    if (((com.plugin.gcm.PushPlugin.gECB) != null) && ((com.plugin.gcm.PushPlugin.gWebView) != null)) {
        com.plugin.gcm.PushPlugin.gWebView.sendJavascript(_d);
    }
}