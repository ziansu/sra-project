@java.lang.Override
public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
    android.util.Log.d(com.gmail.jorgegilcavazos.ballislife.features.login.LoginActivity.TAG, ("started: " + url));
    if (url.contains("code=")) {
        webView.stopLoading();
        com.gmail.jorgegilcavazos.ballislife.network.RedditAuthentication.getInstance().authenticateWithUser(url, authListener);
        finish();
    }
}