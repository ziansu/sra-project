@java.lang.Override
public java.lang.CharSequence getTitle() {
    mActivity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mWebView.execJavaScriptFromString("ZSSEditor.getField('zss_field_title').getHTMLForCallback();");
        }
    });
    mGetTitleCountDownLatch = new java.util.concurrent.CountDownLatch(1);
    try {
        mGetTitleCountDownLatch.await(1, java.util.concurrent.TimeUnit.SECONDS);
    } catch (java.lang.InterruptedException e) {
        org.wordpress.android.util.AppLog.e(T.EDITOR, e);
        java.lang.Thread.currentThread().interrupt();
    }
    return mTitle;
}