private void migrateUserProfilesToKeycloak(java.util.List<org.apache.airavata.UserProfileDAO> Wso2ISProfileList) {
    org.apache.airavata.KeycloakIdentityServerClient client = new org.apache.airavata.KeycloakIdentityServerClient(this.keycloakServiceURL, this.keycloakRealmId, this.keycloakAdminUsername, this.keycloakAdminPassword, this.keycloakTrustStorePath, this.keycloakTrustStorePassword);
    client.migrateUserStore(Wso2ISProfileList, this.keycloakRealmId, this.keycloakTemporaryUserPassword, this.roleConversionMap);
}