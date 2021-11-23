@java.lang.Override
public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
    setWebView();
    parseUri(wv.getUrl());
    if (!(url.equals(com.example.denky.ageis.ReferenceString.MAIN_URL)))
        progressBar.setVisibility(View.VISIBLE);
    
    super.onPageStarted(view, url, favicon);
}