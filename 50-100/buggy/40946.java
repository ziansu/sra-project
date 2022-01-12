private void ensureWebViewSettings(android.webkit.WebSettings webViewSettings) {
    webViewSettings.setUserAgentString("Mozilla/5.0 (Linux; Android 6.0.1; Nexus 6P Build/MMB29P) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.83 Mobile Safari/537.36");
    webViewSettings.setSavePassword(false);
    webViewSettings.setSupportMultipleWindows(true);
    webViewSettings.setBuiltInZoomControls(true);
    webViewSettings.setLoadsImagesAutomatically(true);
    webViewSettings.setJavaScriptEnabled(true);
    webViewSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    webViewSettings.setSupportZoom(true);
}