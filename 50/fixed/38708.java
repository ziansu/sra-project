void restoreState(android.os.Bundle bundle) {
    if ((bundle != null) && (bundle.containsKey(org.mozilla.focus.webview.FocusWebViewClient.STATE_KEY_CERTIFICATE))) {
        restoredUrl = bundle.getString(org.mozilla.focus.webview.FocusWebViewClient.STATE_KEY_URL);
        restoredCertificate = android.net.http.SslCertificate.restoreState(bundle.getBundle("client_last_certificate"));
    }
}