@java.lang.Override
public void initialize(org.apache.cordova.CordovaInterface cordova, org.apache.cordova.CordovaWebView webView) {
    super.initialize(cordova, webView);
    com.plugin.gcm.PushPlugin.gForeground = true;
}