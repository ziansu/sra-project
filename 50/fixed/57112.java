public void run() {
    if ((mWebView) == null) {
        return ;
    }
    net.gree.unitywebview.WebViewPlugin.layout.removeView(mWebView);
    mWebView = null;
}