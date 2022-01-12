private java.lang.String updateStore(org.codice.opendj.embedded.server.LDAPManager.KeystoreInfo keystoreInfo, java.lang.String configStr) {
    java.lang.String newConfig = configStr.trim();
    newConfig = newConfig.replace(keystoreInfo.locationVar, keystoreInfo.location);
    newConfig = newConfig.replace(keystoreInfo.passwordVar, keystoreInfo.password);
    newConfig = newConfig.replace(keystoreInfo.typeVar, keystoreInfo.type);
    newConfig = newConfig.replace(keystoreInfo.passwordPinVar, keystoreInfo.passwordPin);
    return newConfig;
}