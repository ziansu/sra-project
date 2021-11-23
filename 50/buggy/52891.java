@java.lang.Override
public void onPause() {
    super.onPause();
    if ((mWebView) != null) {
        mWebView.stopLoading();
        mWebView.onPause();
        mWebView.pauseTimers();
    }
}