@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String url) {
    if ((url.startsWith("http:")) || (url.startsWith("https:"))) {
        return false;
    }
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(url));
    view.getContext().startActivity(intent);
    return true;
}