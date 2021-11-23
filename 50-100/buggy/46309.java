@java.lang.Override
public final android.webkit.WebResourceResponse shouldInterceptRequest(final android.webkit.WebView view, android.webkit.WebResourceRequest request) {
    java.lang.String requestBody = null;
    android.net.Uri uri = request.getUrl();
    if (isAjaxRequest(request)) {
        requestBody = getRequestBody(request);
        uri = getOriginalRequestUri(request, MARKER);
    }
    android.webkit.WebResourceResponse webResourceResponse = shouldInterceptRequest(view, new com.konstantinschubert.writeinterceptingwebview.WriteHandlingWebResourceRequest(request, requestBody, uri));
    return injectIntercept(webResourceResponse, view.getContext());
}