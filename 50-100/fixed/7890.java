private java.lang.String createFullUrl(final java.lang.String url, final java.util.Map<java.lang.String, java.lang.Object> params) {
    java.lang.String fullUrl = url;
    if (params != null) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> paramEntry : params.entrySet()) {
            fullUrl = addParameter(fullUrl, paramEntry.getKey(), paramEntry.getValue().toString());
        }
    }
    return enableRedirect(fullUrl);
}