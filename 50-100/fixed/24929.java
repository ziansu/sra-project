private void showPage(java.lang.String page, java.lang.String key) {
    mWebView.setWebViewClient(new com.ievolutioned.iac.fragment.SitesFragment.SiteWebClient());
    android.webkit.WebSettings settings = mWebView.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    if ((com.ievolutioned.iac.util.AppConfig.DEBUG) && ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)))
        mWebView.setWebContentsDebuggingEnabled(true);
    
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP))
        settings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
    
    mWebView.loadUrl(setHttpParams(page, key));
}