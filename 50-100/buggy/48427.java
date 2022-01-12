private java.lang.String updateStore(org.codice.opendj.embedded.server.LDAPManager.KeystoreInfo keystoreInfo, java.lang.String configStr) {
    java.lang.String newConfig = configStr.trim();
    newConfig = newConfig.replaceAll(keystoreInfo.locationVar, keystoreInfo.location);
    newConfig = newConfig.replaceAll(keystoreInfo.passwordVar, keystoreInfo.password);
    newConfig = newConfig.replaceAll(keystoreInfo.typeVar, keystoreInfo.type);
    newConfig = newConfig.replaceAll(keystoreInfo.passwordPinVar, keystoreInfo.passwordPin);
    return newConfig;
}