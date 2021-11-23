@java.lang.Override
public void onReceivedIcon(android.webkit.WebView view, android.graphics.Bitmap icon) {
    mWebChromeClient.onReceivedIcon(view, icon);
}