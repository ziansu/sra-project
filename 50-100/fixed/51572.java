private void initialiseWebView() {
    if ((webView) == null) {
        webView = ((android.webkit.WebView) (findViewById(R.id.web_irc)));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new android.webkit.WebViewClient() {
            @java.lang.Override
            public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
                return false;
            }
        });
        webView.loadUrl(((java.lang.String) (getIntent().getExtras().get("url"))));
    }
}