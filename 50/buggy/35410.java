@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    android.widget.Toast.makeText(context, (url + "overrrider url loading"), Toast.LENGTH_LONG).show();
    view.loadUrl(url);
    return super.shouldOverrideUrlLoading(view, url);
}