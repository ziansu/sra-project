@java.lang.Override
public void run() {
    if (mQuit) {
        android.util.Log.e(com.crosskr.flint.webview.browser.BrowserActivity.TAG, "mVideoUrlRunnable:quit!");
        return ;
    }
    if (((mCurrentView) != null) && (!(isKeyBoardOpened))) {
        android.util.Log.e(com.crosskr.flint.webview.browser.BrowserActivity.TAG, "try to extract real video url!");
        java.lang.String GET_VIDEO_URL_SCRIPT = "(function () {var videos = document.getElementsByTagName('video'); if (videos != null && videos[0] != null) {alert('xxx:' + videos[0].src);}})();";
        mCurrentView.getWebView().loadUrl(("javascript:" + GET_VIDEO_URL_SCRIPT));
    }
    mHandler.removeCallbacks(mVideoUrlRunnable);
    mHandler.postDelayed(mVideoUrlRunnable, com.crosskr.flint.webview.browser.BrowserActivity.REFRESH_INTERVAL_MS);
}