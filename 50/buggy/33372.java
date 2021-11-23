@java.lang.Override
public boolean onLongClick(android.view.View view) {
    android.webkit.WebView webView = ((android.webkit.WebView) (view));
    showDownloadConfirmDialog(webView);
    return false;
}