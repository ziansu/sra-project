@java.lang.Override
public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
    if (url.contains("code=")) {
        onUserChallenge(url, Respite.CREDENTIALS);
    }else
        if (url.contains("error=")) {
            android.widget.Toast.makeText(this, R.string.loginactivity_failure_userdeclined, Toast.LENGTH_LONG).show();
            webView.loadUrl(authorizationURL.toExternalForm());
        }
    
}