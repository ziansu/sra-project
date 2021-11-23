@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    com.android.agnetty.utils.LogUtil.d("onNewIntent ..........");
    android.net.Uri uri = intent.getData();
    java.lang.String params = uri.getQueryParameter("params");
    java.lang.String sign = uri.getQueryParameter("sign");
    if ((params != null) && (sign != null)) {
        mWebView.loadUrl("javascript:queryVerifyResult()");
    }
}