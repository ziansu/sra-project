@java.lang.Override
public void onReceivedLoginRequest(android.webkit.WebView view, java.lang.String realm, java.lang.String account, java.lang.String args) {
    new com.github.takahirom.zerobrowser.webview.DeviceAccountLogin(mWebViewController.getActivity(), view, this, mWebViewController).handleLogin(realm, account, args);
}