public static java.net.URI pathToURI(org.apache.hadoop.fs.swift.util.SwiftObjectPath path, java.net.URI endpointURI) throws org.apache.hadoop.fs.swift.exceptions.SwiftException {
    org.apache.hadoop.fs.swift.http.SwiftRestClient.checkNotNull(endpointURI, "Null Endpoint -client is not authenticated");
    java.lang.String dataLocationURI = endpointURI.toString();
    try {
        dataLocationURI = org.apache.hadoop.fs.swift.util.SwiftUtils.joinPaths(dataLocationURI, org.apache.hadoop.fs.swift.util.SwiftUtils.encodeUrl(path.toUriPath()));
        return new java.net.URI(dataLocationURI);
    } catch (java.net.URISyntaxException e) {
        throw new org.apache.hadoop.fs.swift.exceptions.SwiftException(("Failed to create URI from " + dataLocationURI), e);
    }
}