public void evaluateJavaScript(java.lang.String script, final android.webkit.ValueCallback<java.lang.String> callback) {
    if (org.chromium.android_webview.AwContents.TRACE)
        org.chromium.base.Log.i(org.chromium.android_webview.AwContents.TAG, "%s evaluateJavascript=%s", this, script);
    
    if (isDestroyed(org.chromium.android_webview.AwContents.WARN))
        return ;
    
    org.chromium.content_public.browser.JavaScriptCallback jsCallback = null;
    if (callback != null) {
        jsCallback = new org.chromium.content_public.browser.JavaScriptCallback() {
            @java.lang.Override
            public void handleJavaScriptResult(java.lang.String jsonResult) {
                callback.onReceiveValue(jsonResult);
            }
        };
    }
    mWebContents.evaluateJavaScript(script, jsCallback);
}