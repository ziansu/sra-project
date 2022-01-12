@java.lang.Override
public void onReceivedTitle(android.webkit.WebView view, java.lang.String title) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.onReceivedTitle(view, title);
    }
}