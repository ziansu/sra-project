@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    if (((url.startsWith("mailto:")) || (url.startsWith("geo:"))) || (url.startsWith("tel:"))) {
        android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(url));
        startActivity(intent);
    }
    return true;
}