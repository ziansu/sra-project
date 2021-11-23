void pause() {
    if ((webView) != null) {
        webView.onPause();
        if ((mSubView) != null) {
            mSubView.onPause();
        }
    }
}