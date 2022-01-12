@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    if (url.equals(this.url)) {
        return true;
    }
    android.net.Uri uri = android.net.Uri.parse(url);
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, uri);
    getContext().startActivity(intent);
    progressBar.setVisibility(View.GONE);
    return true;
}