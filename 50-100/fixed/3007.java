@java.lang.Override
protected void onDestroy() {
    if ((moPubView) != null) {
        moPubView.destroy();
    }
    super.onDestroy();
    if ((webView) != null) {
        webView.setVisibility(View.GONE);
        webView.removeAllViews();
        webView.destroy();
    }
}