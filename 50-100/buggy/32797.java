@java.lang.Override
public void onPageFinished(final android.webkit.WebView view, java.lang.String url) {
    if ((hasLoadedWebview) == 1)
        return ;
    
    hasLoadedWebview = 1;
    webFrame.addView(webView);
    android.widget.FrameLayout.LayoutParams params = new android.widget.FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    webView.setLayoutParams(params);
    addJavascriptInterfaces();
    requestPermissions();
}