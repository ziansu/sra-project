private static java.lang.String processUrl(@android.support.annotation.NonNull
java.lang.String url) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> parameter : es.sandwatch.httprequests.HttpRequest.sRequestUrlParams.entrySet()) {
        url += (!(url.contains("?"))) ? "?" : "&";
        url += ((parameter.getKey()) + "=") + (parameter.getValue());
    }
    return url;
}