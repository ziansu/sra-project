@java.lang.Override
public void onCreateWindow(boolean isUserGesture, android.os.Message resultMsg) {
    if (resultMsg == null) {
        return ;
    }
    if (newTab("", true)) {
        acr.browser.lightning.WebView.WebViewTransport transport = ((acr.browser.lightning.WebView.WebViewTransport) (resultMsg.obj));
        transport.setWebView(mCurrentView.getWebView());
        resultMsg.sendToTarget();
    }
}