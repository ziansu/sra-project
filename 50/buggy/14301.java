public void resume() {
    com.duckduckgo.mobile.android.duckduckgo.ui.tab.DDGWebView webView = getWebViewForTabId(currentId);
    if (webView == null)
        return ;
    
    browserPresenter.attachTabView(webView);
    resumeWebView(webView);
}