@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    org.springframework.core.io.Resource resource = getResource(authoritiesConfigurationFile);
    java.net.URI uri = null;
    try {
        uri = resource.getURI();
        if (uri == null) {
            throw new se.inera.intyg.rehabstod.auth.authorities.AuthoritiesException("Could not load authorities configuration file. Path to file is null.");
        }
        authoritiesConfiguration = loadConfiguration(java.nio.file.Paths.get(uri));
    } catch (java.io.IOException ioe) {
        throw new se.inera.intyg.rehabstod.auth.authorities.AuthoritiesException(java.lang.String.format("Could not load authorities configuration file %s", uri.getPath()), ioe);
    }
}