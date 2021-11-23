public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    if (mProgress.isShowing()) {
        mProgress.dismiss();
    }
}