protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    java.lang.String action = intent.getAction();
    android.net.Uri data = intent.getData();
    if (data != null) {
        print(("got an incoming link = " + (data.toString())));
        if ((callView) != null)
            callView.destroy();
        
        if ((webView) != null)
            webView.destroy();
        
        hasLoadedWebview = 0;
        loadChromeApp(data.toString());
    }
}