@java.lang.Override
public boolean shouldOverrideUrlLoading(com.crosskr.flint.webview.browser.WebView view, java.lang.String url) {
    view.loadUrl(url);
    return true;
}