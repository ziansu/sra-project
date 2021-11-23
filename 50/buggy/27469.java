@java.lang.Override
public boolean onJsAlert(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) {
    return mWebChromeClient.onJsAlert(view, url, message, result);
}