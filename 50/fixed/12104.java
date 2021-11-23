@java.lang.Override
public void onReceivedIcon(android.webkit.WebView view, android.graphics.Bitmap icon) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.onReceivedIcon(view, icon);
    }
}