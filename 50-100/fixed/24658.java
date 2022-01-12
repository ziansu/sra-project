public boolean pathExists(java.lang.String path) {
    java.lang.String url = (getContextBaseUrl()) + (path.startsWith("/") ? path : '/' + path);
    org.carlspring.strongbox.client.ArtifactClient.logger.debug(("Path to artifact: " + url));
    javax.ws.rs.client.WebTarget resource = getClientInstance().target(url);
    setupAuthentication(resource);
    javax.ws.rs.core.Response response = resource.request(MediaType.TEXT_PLAIN).get();
    return (response.getStatus()) == 200;
}