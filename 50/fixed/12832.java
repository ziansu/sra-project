void resume() {
    if ((webView) != null) {
        setupHwAcceleration(webView);
        webView.onResume();
    }
}