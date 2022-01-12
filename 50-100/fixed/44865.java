private void init(java.lang.String url, com.unity3d.ads.android.webapp.IUnityAdsWebViewListener listener, com.unity3d.ads.android.webapp.UnityAdsWebBridge webBridge) {
    _listener = listener;
    _url = url;
    _webBridge = webBridge;
    setupUnityAdsView();
    loadUrl(_url);
    if ((Build.VERSION.SDK_INT) > 8) {
        setOnLongClickListener(new com.unity3d.ads.android.webapp.OnLongClickListener() {
            @java.lang.Override
            public boolean onLongClick(android.view.View v) {
                return true;
            }
        });
        setLongClickable(false);
    }
}