@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    android.util.Log.d(com.gsma.mobileconnect.helpers.AuthorizationService.TAG, ("shouldOverrideUrlLoading url=" + url));
    boolean status = false;
    if ((url != null) && (url.startsWith(redirectUri))) {
        handleCompletion(view, url);
    }else {
        view.loadUrl(url);
    }
    return status;
}