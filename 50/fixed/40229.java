@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    createWebPrintJob(view);
    mWebView = null;
}