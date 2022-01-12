@java.lang.Override
public android.webkit.WebViewDatabase getWebViewDatabase(final android.content.Context context) {
    synchronized(mLock) {
        if ((mWebViewDatabase) == null) {
            ensureChromiumStartedLocked(true);
            org.chromium.android_webview.HttpAuthDatabase awDatabase = (org.chromium.base.ThreadUtils.runningOnUiThread()) ? getBrowserContextOnUiThread().getHttpAuthDatabase(context) : runOnUiThreadBlocking(new java.util.concurrent.Callable<org.chromium.android_webview.HttpAuthDatabase>() {
                @java.lang.Override
                public org.chromium.android_webview.HttpAuthDatabase call() {
                    return getBrowserContextOnUiThread().getHttpAuthDatabase(context);
                }
            });
            mWebViewDatabase = new com.android.webview.chromium.WebViewDatabaseAdapter(this, awDatabase);
        }
    }
    return mWebViewDatabase;
}