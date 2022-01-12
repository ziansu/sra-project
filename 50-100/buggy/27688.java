public static java.util.List<sh.calaba.espressobackend.actions.webview.CalabashChromeClient> findAndPrepareWebViews() {
    java.util.List<sh.calaba.espressobackend.actions.webview.CalabashChromeClient> webViews = new java.util.ArrayList<sh.calaba.espressobackend.actions.webview.CalabashChromeClient>();
    sh.calaba.espressobackend.query.espresso.WebViewCaptorMatcher webViewCaptorMatcher = new sh.calaba.espressobackend.query.espresso.WebViewCaptorMatcher();
    com.google.android.apps.common.testing.ui.espresso.Espresso.onView(webViewCaptorMatcher).perform(new sh.calaba.espressobackend.query.espresso.ViewCaptor());
    java.util.List<android.webkit.WebView> views = webViewCaptorMatcher.getCapturedViews();
    for (android.webkit.WebView view : views) {
        try {
            webViews.add(sh.calaba.espressobackend.actions.webview.CalabashChromeClient.prepareWebView(view));
        } catch (java.lang.Throwable t) {
            java.lang.System.out.println("OH OH");
        }
    }
    return webViews;
}