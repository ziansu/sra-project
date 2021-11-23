protected java.net.URI createBaseContainer(java.lang.String name) throws java.io.IOException, org.fcrepo.client.FcrepoOperationFailedException {
    java.net.URI baseUri = java.net.URI.create(edu.unc.lib.dl.util.URIUtil.join(baseAddress, name));
    try (org.fcrepo.client.FcrepoResponse response = client.put(baseUri).perform()) {
        return response.getLocation();
    } catch (org.fcrepo.client.FcrepoOperationFailedException e) {
        if ((e.getStatusCode()) != (org.apache.http.HttpStatus.SC_CONFLICT)) {
            throw e;
        }
        return baseUri;
    }
}