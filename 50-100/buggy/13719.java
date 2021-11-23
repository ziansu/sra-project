@java.lang.Override
@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
public void onReceivedHttpError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) {
    didReceiveError = true;
    switch (errorResponse.getStatusCode()) {
        case org.edx.mobile.http.HttpStatus.FORBIDDEN :
        case org.edx.mobile.http.HttpStatus.UNAUTHORIZED :
        case org.edx.mobile.http.HttpStatus.NOT_FOUND :
            org.edx.mobile.services.EdxCookieManager.getSharedInstance().tryToRefreshSessionCookie();
            break;
    }
    showErrorMessage(R.string.network_error_message, FontAwesomeIcons.fa_exclamation_circle);
}