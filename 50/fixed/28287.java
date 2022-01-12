@java.lang.Override
public void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> callback) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.getVisitedHistory(callback);
    }
}