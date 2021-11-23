public org.jolokia.docker.maven.access.AuthConfig createAuthConfig(java.util.Map authConfig, org.apache.maven.settings.Settings settings, java.lang.String user, java.lang.String registry) throws org.apache.maven.plugin.MojoExecutionException {
    java.util.Properties props = java.lang.System.getProperties();
    if ((props.containsKey(org.jolokia.docker.maven.util.AuthConfigFactory.DOCKER_USERNAME)) || (props.containsKey(org.jolokia.docker.maven.util.AuthConfigFactory.DOCKER_PASSWORD))) {
        return getAuthConfigFromProperties(props, registry);
    }
    if (authConfig != null) {
        return getAuthConfigFromPluginConfiguration(authConfig, registry);
    }
    return getAuthConfigFromSettings(settings, user, registry);
}