public org.eclipse.che.plugin.docker.client.dto.AuthConfig getInitialAuthConfig() {
    if ((predefinedConfig) != null) {
        return predefinedConfig;
    }else {
        return null;
    }
}