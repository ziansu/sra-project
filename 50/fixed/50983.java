public void removeWebView(android.view.ViewGroup parent) {
    boolean isWebView = isWebViewShowing(parent);
    if (isWebView) {
        parent.setTag("");
        removeChildViews(parent);
    }
}