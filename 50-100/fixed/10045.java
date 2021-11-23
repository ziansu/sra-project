public static void sendExtras(android.os.Bundle extras) {
    if (extras != null) {
        if (((com.plugin.gcm.PushPlugin.gECB) != null) && ((com.plugin.gcm.PushPlugin.gWebView) != null)) {
            com.plugin.gcm.PushPlugin.sendJavascript(com.plugin.gcm.PushPlugin.convertBundleToJson(extras));
        }else {
            com.plugin.gcm.PushPlugin.gCachedExtras = extras;
        }
    }
}