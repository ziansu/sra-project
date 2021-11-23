public void run() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        de.appplant.cordova.plugin.localnotification.LocalNotification.webView.evaluateJavascript(js, null);
    }else {
        de.appplant.cordova.plugin.localnotification.LocalNotification.webView.loadUrl(("javascript:" + js));
    }
}