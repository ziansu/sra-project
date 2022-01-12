@javax.annotation.PostConstruct
public void load() {
    org.zanata.ApplicationConfiguration.log.info("Reloading configuration");
    this.loadLoginModuleNames();
    this.loadJaasConfig();
    authenticatedSessionTimeoutMinutes = sysPropConfigStore.get("authenticatedSessionTimeoutMinutes", 180);
    enforceMatchingUsernames = java.lang.Boolean.parseBoolean(sysPropConfigStore.get("zanata.enforce.matchingusernames"));
    tokenExpiresInSeconds = sysPropConfigStore.getLong(org.zanata.ApplicationConfiguration.ACCESS_TOKEN_EXPIRES_IN_SECONDS, 3600);
}