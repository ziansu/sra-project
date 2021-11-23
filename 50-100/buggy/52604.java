protected org.apache.cordova.CordovaWebView makeWebView() {
    java.lang.String webViewClassName = preferences.getString("webView", org.apache.cordova.AndroidWebView.class.getCanonicalName());
    try {
        java.lang.Class<?> webViewClass = java.lang.Class.forName(webViewClassName);
        java.lang.reflect.Constructor<?> constructor = webViewClass.getConstructor(android.content.Context.class);
        org.apache.cordova.CordovaWebView ret = ((org.apache.cordova.CordovaWebView) (constructor.newInstance(((android.content.Context) (this)))));
        return ret;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to create webview. ", e);
    }
    return ret;
}