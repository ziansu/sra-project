private static CredentialStoreService.Client getCredentialStoreClient() {
    try {
        java.lang.String credServerHost = org.apache.airavata.common.utils.ServerSettings.getCredentialStoreServerHost();
        int credServerPort = java.lang.Integer.valueOf(org.apache.airavata.common.utils.ServerSettings.getCredentialStoreServerPort());
        return org.apache.airavata.credential.store.client.CredentialStoreClientFactory.createAiravataCSClient(null, 0);
    } catch (org.apache.airavata.credential.store.exception.CredentialStoreException | org.apache.airavata.common.exception.ApplicationSettingsException e) {
        throw new java.lang.RuntimeException("Failed to create credential store service client", e);
    }
}