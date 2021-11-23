@com.jcabi.aspects.Cacheable(lifetime = 5, unit = java.util.concurrent.TimeUnit.MINUTES)
org.sagebionetworks.bridge.sdk.UploadSchemaClient getSchemaClient() {
    org.sagebionetworks.bridge.sdk.Session session = org.sagebionetworks.bridge.sdk.ClientProvider.signIn(credentials);
    return session.getUploadSchemaClient();
}