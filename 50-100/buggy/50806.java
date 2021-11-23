@android.annotation.SuppressLint(value = "SetJavaScriptEnabled")
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_code);
    initBluetooth();
    loadPrefs();
    android.webkit.WebSettings wSettings;
    webView = new android.webkit.WebView(this);
    webView.setClickable(true);
    wSettings = webView.getSettings();
    wSettings.setJavaScriptEnabled(true);
    wSettings.setDomStorageEnabled(true);
    webView.addJavascriptInterface(new ksmaragh.c4q.nyc.accessrobot.MoziActivity.myJsInterface(this), "Android");
    webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    loadWebURL();
}