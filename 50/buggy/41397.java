protected com.box.androidsdk.content.auth.OAuthWebView.OAuthWebViewClient createOAuthWebViewClient(java.lang.String optionalState) {
    return new com.box.androidsdk.content.auth.OAuthWebView.OAuthWebViewClient(this, mRedirectUrl, optionalState);
}