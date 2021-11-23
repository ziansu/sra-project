@java.lang.Override
public void onReceivedHttpError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) {
    android.util.Log.d(com.mobideck.appdeck.SmartWebViewChrome.TAG, ((("HTTP Error:" + (errorResponse.getStatusCode())) + ":") + (errorResponse.getReasonPhrase())));
    if (request.getUrl().toString().equalsIgnoreCase(url)) {
        pageHasFinishLoadingWithError = true;
        setVisibility(View.INVISIBLE);
        return ;
    }
}