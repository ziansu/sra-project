@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    updateTitleBar(view.getTitle(), url);
    view.loadUrl(url);
    return false;
}