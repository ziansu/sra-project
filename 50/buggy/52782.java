@java.lang.Override
public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
    hideProgress();
    displayError();
}