@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    org.springframework.core.io.Resource resource = getResource(authoritiesConfigurationFile);
    java.lang.String path = null;
    try {
        if ((resource.getURI()) == null) {
            throw new se.inera.intyg.rehabstod.auth.authorities.AuthoritiesException("Could not load authorities configuration file. Path to file is null.");
        }
        path = resource.getURI().getPath();
        authoritiesConfiguration = loadConfiguration(java.nio.file.Paths.get(path));
    } catch (java.io.IOException ioe) {
        throw new se.inera.intyg.rehabstod.auth.authorities.AuthoritiesException(java.lang.String.format("Could not load authorities configuration file %s", path), ioe);
    }
}