public void run() {
    if ((mWebView) != null) {
        net.gree.unitywebview.WebViewPlugin.layout.removeView(mWebView);
        mWebView = null;
    }
}