private void ensureWebViewSettings(android.webkit.WebSettings webViewSettings) {
    webViewSettings.setSavePassword(false);
    webViewSettings.setSupportMultipleWindows(true);
    webViewSettings.setBuiltInZoomControls(true);
    webViewSettings.setLoadsImagesAutomatically(true);
    webViewSettings.setJavaScriptEnabled(true);
    webViewSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    webViewSettings.setSupportZoom(true);
}