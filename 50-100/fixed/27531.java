@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    this.sharedPreferences = this.getSharedPreferences("share", ch.tink.humhub.MODE_PRIVATE);
    if (this.isUrlSet()) {
        this.myWebView = ((android.webkit.WebView) (findViewById(R.id.webView)));
        this.loadWebView();
    }else {
        android.content.Intent intent = new android.content.Intent(this, ch.tink.humhub.WelcomeActivity.class);
        startActivity(intent);
    }
}