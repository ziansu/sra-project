@java.lang.Override
protected void onRefresh() {
    mWebView.setVisibility(View.VISIBLE);
    getContentView().removeAllViews();
    getContentView().addView(mWebView);
    loadSelectedFloor();
}