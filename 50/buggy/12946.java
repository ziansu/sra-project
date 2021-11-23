public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    mEdittext.setText(url);
    return _handleRedirect(url);
}