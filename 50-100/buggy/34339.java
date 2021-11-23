public static com.blackducksoftware.integration.hub.rest.RestConnection getRestConnection(final com.blackducksoftware.integration.log.IntLogger logger, final java.lang.String serverUrl, final java.lang.String username, final java.lang.String password, final java.lang.String hubTimeout, final boolean autoImportHttpsCertificates) throws com.blackducksoftware.integration.exception.EncryptionException, java.net.MalformedURLException {
    final com.blackducksoftware.integration.hub.builder.HubServerConfigBuilder hubServerConfigBuilder = new com.blackducksoftware.integration.hub.builder.HubServerConfigBuilder();
    hubServerConfigBuilder.setHubUrl(serverUrl);
    hubServerConfigBuilder.setUsername(username);
    hubServerConfigBuilder.setPassword(password);
    hubServerConfigBuilder.setTimeout(hubTimeout);
    hubServerConfigBuilder.setAlwaysTrustServerCertificate(autoImportHttpsCertificates);
    return com.blackducksoftware.integration.hub.jenkins.helper.BuildHelper.getRestConnection(logger, hubServerConfigBuilder);
}