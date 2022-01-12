public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    super.onReceivedError(view, errorCode, description, failingUrl);
    browserEventSender.error(failingUrl, errorCode, description);
}