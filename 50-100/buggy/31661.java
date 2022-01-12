private com.adeptj.modules.jaxrs.core.JaxRSAuthenticationInfo getAuthenticationInfo(java.lang.String subject, java.lang.String password) {
    this.authRealms.sort(com.adeptj.modules.jaxrs.core.JaxRSAuthenticator::compare);
    for (com.adeptj.modules.jaxrs.core.api.JaxRSAuthenticationRealm realm : this.authRealms) {
        com.adeptj.modules.jaxrs.core.JaxRSAuthenticationInfo authInfo = realm.getAuthenticationInfo(subject, password);
        if ((authInfo == null) && (com.adeptj.modules.jaxrs.core.JaxRSAuthenticator.LOGGER.isDebugEnabled())) {
            com.adeptj.modules.jaxrs.core.JaxRSAuthenticator.LOGGER.debug("Realm: [{}] couldn't validate credentials!", realm.getName());
        }else {
            return authInfo;
        }
    }
    return null;
}