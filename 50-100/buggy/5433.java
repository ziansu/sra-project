public static com.blackducksoftware.integration.hub.rest.RestConnection getRestConnection(final com.blackducksoftware.integration.log.IntLogger logger, final java.lang.String serverUrl, final java.lang.String username, final java.lang.String password, final int hubTimeout) throws com.blackducksoftware.integration.exception.EncryptionException, java.net.MalformedURLException {
    final com.blackducksoftware.integration.hub.builder.HubServerConfigBuilder hubServerConfigBuilder = new com.blackducksoftware.integration.hub.builder.HubServerConfigBuilder();
    hubServerConfigBuilder.setHubUrl(serverUrl);
    hubServerConfigBuilder.setUsername(username);
    hubServerConfigBuilder.setPassword(password);
    hubServerConfigBuilder.setTimeout(hubTimeout);
    return com.blackducksoftware.integration.hub.jenkins.helper.BuildHelper.getRestConnection(logger, hubServerConfigBuilder);
}