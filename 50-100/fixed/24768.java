@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if (writePermissionNotGranted()) {
            requestWritePermission();
        }
    }
    setContentView(R.layout.activity_main);
    super.onCreate(savedInstanceState);
    edu.txstate.mobile.tracs.util.LoginStatus.getInstance().addObserver(this);
    java.lang.String destinationUrl = getDestinationUrl();
    tracsWebView = ((edu.txstate.mobile.tracs.TracsWebView) (findViewById(R.id.tracs_webview)));
    tracsWebView.loadUrl(destinationUrl, true);
}