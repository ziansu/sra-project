@java.lang.Override
public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    android.util.Log.d(com.mobideck.appdeck.SmartWebViewChrome.TAG, ((("WebView Error:" + errorCode) + ":") + description));
    if (failingUrl.equalsIgnoreCase(url)) {
        pageHasFinishLoadingWithError = true;
        setVisibility(View.INVISIBLE);
        return ;
    }
}