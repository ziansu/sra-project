@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
@java.lang.Override
public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
    if (mAdBlock.isAd(request.getUrl().toString())) {
        java.io.ByteArrayInputStream EMPTY = new java.io.ByteArrayInputStream("".getBytes());
        return new android.webkit.WebResourceResponse("text/plain", "utf-8", EMPTY);
    }
    return super.shouldInterceptRequest(view, request);
}