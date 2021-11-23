public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    webView.loadUrl("javascript:setClientToolConnected()");
    if ((jsCommand) != null)
        webView.loadUrl(jsCommand);
    
    setProgressDialogVisible(false);
}