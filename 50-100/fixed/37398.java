private java.lang.String getBaseUri() throws org.apache.olingo.odata2.api.batch.BatchException {
    java.lang.String baseUri = "";
    if (((batchRequestPathInfo) != null) && ((batchRequestPathInfo.getServiceRoot()) != null)) {
        final java.lang.String uri = batchRequestPathInfo.getServiceRoot().toASCIIString();
        baseUri = removeLastSlash(uri);
    }
    return baseUri;
}