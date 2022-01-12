private com.xebialabs.xlt.ci.server.Request createRequestFor(java.lang.String relativeUrl, java.lang.String serverUrl) {
    try {
        java.net.URL url = createUrl(relativeUrl, serverUrl);
        return new com.xebialabs.xlt.ci.server.Request.Builder().url(url).header("User-Agent", getUserAgent()).header("Accept", com.xebialabs.xlt.ci.server.XLTestServerImpl.APPLICATION_JSON_UTF_8).header("Authorization", createCredential()).build();
    } catch (java.net.MalformedURLException e) {
        throw new java.lang.IllegalArgumentException(e);
    } catch (java.net.URISyntaxException e) {
        throw new java.lang.IllegalArgumentException(e);
    }
}