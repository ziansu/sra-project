private java.lang.String getBaseUri(final org.apache.olingo.odata2.api.processor.ODataRequest request) {
    java.lang.String baseUri = request.getPathInfo().getServiceRoot().toASCIIString();
    if (baseUri.endsWith("/")) {
        baseUri = baseUri.substring(0, ((baseUri.length()) - 1));
    }
    return baseUri;
}