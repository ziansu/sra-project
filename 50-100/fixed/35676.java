@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_webview);
    java.lang.String url = getIntent().getStringExtra(programmingsolutions.tafebuddy.WebviewActivity.EXTRA_URL);
    android.webkit.WebView webView = ((android.webkit.WebView) (findViewById(R.id.webview)));
    webView.setWebViewClient(new android.webkit.WebViewClient());
    android.webkit.WebSettings webSettings = webView.getSettings();
    webSettings.setJavaScriptEnabled(true);
    setTitle(url);
    getSupportActionBar();
    webView.loadUrl(url);
}