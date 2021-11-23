public de.securitysquad.webifier.config.WebifierConfig load(java.io.InputStream is) throws java.io.IOException {
    return mapper.readValue(is, de.securitysquad.webifier.config.WebifierConfig.class);
}