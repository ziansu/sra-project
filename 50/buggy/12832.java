void resume() {
    if ((webView) != null) {
        setupHwAcceleration(webView);
        webView.onResume();
        if ((mSubView) != null) {
            mSubView.onResume();
        }
    }
}