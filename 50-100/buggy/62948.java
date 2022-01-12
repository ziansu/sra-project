protected boolean isValidHost(java.lang.String url) {
    if (!(android.text.TextUtils.isEmpty(url))) {
        final java.lang.String host = android.net.Uri.parse(url).getHost();
        for (java.lang.String whitelistedHost : hostsWhitelist) {
            if (com.mikifus.padland.SaferWebView.PadLandSaferWebViewClient.wildCardMatch(host, whitelistedHost)) {
                return true;
            }
        }
    }
    return false;
}