@java.lang.Override
public void onProgressChanged(android.webkit.WebView view, int newProgress) {
    mWebChromeClient.onProgressChanged(view, newProgress);
}