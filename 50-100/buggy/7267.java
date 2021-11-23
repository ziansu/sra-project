private java.lang.String getBaseUri(final org.apache.olingo.odata2.api.processor.ODataRequest request) {
    java.lang.String baseUri = request.getPathInfo().getServiceRoot().toASCIIString();
    if (baseUri.endsWith("/")) {
        baseUri = baseUri.substring(0, ((baseUri.length()) - 1));
    }
    for (org.apache.olingo.odata2.api.uri.PathSegment segment : request.getPathInfo().getPrecedingSegments()) {
        baseUri += "/" + (segment.getPath());
    }
    return baseUri;
}