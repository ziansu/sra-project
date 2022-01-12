protected static void isTotpConfigurationRequired(org.keycloak.models.RealmModel realm, org.keycloak.models.UserModel user) {
    for (org.keycloak.models.RequiredCredentialModel c : realm.getRequiredCredentials()) {
        if ((c.getType().equals(CredentialRepresentation.TOTP)) && (!(user.isTotp()))) {
            org.keycloak.services.managers.AuthenticationManager.logger.debug("User is required to configure totp");
        }
    }
}