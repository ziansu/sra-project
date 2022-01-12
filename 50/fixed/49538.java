@java.lang.Override
public boolean onCreateWindow(android.webkit.WebView view, boolean isDialog, boolean isUserGesture, android.os.Message resultMsg) {
    if ((mWebChromeClient) != null) {
        return mWebChromeClient.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
    }
    return false;
}