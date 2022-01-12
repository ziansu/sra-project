@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    android.util.Log.d(com.gsma.mobileconnect.helpers.DiscoveryService.TAG, ("shouldOverrideUrlLoading " + url));
    boolean status = false;
    if ((url != null) && (url.contains("mcc_mnc="))) {
        handleResult(view, url);
    }else {
        view.loadUrl(url);
    }
    return status;
}