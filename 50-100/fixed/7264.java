public void updateCallback(java.util.Map<java.lang.String, ?> properties) {
    this.lexevsRemoteApiUrl = ((java.lang.String) (properties.get("lexevsRemoteApiUrl")));
    this.lgConfigFile = ((java.lang.String) (properties.get(edu.mayo.cts2.framework.plugin.service.lexevs.LexBigServiceFactory.LG_CONFIG_FILE_ENV)));
    this.hasBeenConfigured = true;
}