private static synchronized void sendJavascript(final java.lang.String js) {
    if (!(de.appplant.cordova.plugin.localnotification.LocalNotification.deviceready)) {
        de.appplant.cordova.plugin.localnotification.LocalNotification.eventQueue.add(js);
        return ;
    }
    de.appplant.cordova.plugin.localnotification.LocalNotification.webView.getView().post(new java.lang.Runnable() {
        public void run() {
            if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
                de.appplant.cordova.plugin.localnotification.LocalNotification.webView.sendJavascript(js);
            }else {
                de.appplant.cordova.plugin.localnotification.LocalNotification.webView.loadUrl(("javascript:" + js));
            }
        }
    });
}