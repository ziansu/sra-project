public uk.ac.ebi.biostudy.submission.AppConfig.AppConfigBuilder setServerUrl(java.lang.String value) {
    java.net.URI url = null;
    try {
        if (value != null) {
            url = new java.net.URL(value).toURI();
        }
    } catch (java.net.URISyntaxException | java.net.MalformedURLException e) {
        uk.ac.ebi.biostudy.submission.AppConfig.logger.error("Malformed URL parameter in config", e);
    }
    return setServerUrl(url);
}