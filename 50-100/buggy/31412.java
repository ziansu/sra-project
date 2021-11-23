private com.google.api.client.auth.oauth2.Credential getGoogleCredential(com.mat.model.MatCredential credential) throws java.lang.Throwable {
    com.google.api.client.auth.oauth2.Credential googleCredential = new com.google.api.client.googleapis.auth.oauth2.GoogleCredential.Builder().setJsonFactory(com.mat.model.GoogleExternalServices.JSON_FACTORY).setTransport(com.mat.model.GoogleExternalServices.HTTP_TRANSPORT).setClientSecrets(ServicesConstants.CLIENT_ID, ServicesConstants.CLIENT_SECRET).build();
    googleCredential.setRefreshToken(credential.getRefreshToken());
    googleCredential.refreshToken();
    return googleCredential;
}