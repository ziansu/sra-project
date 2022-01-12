@java.lang.Override
public void onPageFinished(android.webkit.WebView webView, java.lang.String url) {
    super.onPageFinished(webView, url);
    if (!(mLastLoadFailed)) {
        com.facebook.react.views.webview.ReactWebViewManager.ReactWebView reactWebView = ((com.facebook.react.views.webview.ReactWebViewManager.ReactWebView) (webView));
        reactWebView.callInjectedJavaScript();
        reactWebView.linkBridge();
        emitFinishEvent(webView, url);
    }
}