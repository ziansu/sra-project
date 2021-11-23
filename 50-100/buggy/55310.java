@java.lang.Override
public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
    android.util.Log.d(com.mobideck.appdeck.SmartWebViewChrome.TAG, ((("WebView Error:" + (error.getErrorCode())) + ":") + (error.getDescription())));
    if (request.getUrl().toString().equalsIgnoreCase(url)) {
        pageHasFinishLoadingWithError = true;
        setVisibility(View.INVISIBLE);
        return ;
    }
}