@java.lang.Override
public java.net.URL getIconUrl() {
    final java.lang.String iconLocation = "/images/blue-document-insert.png";
    try {
        return getClass().getResource(iconLocation).toURI().toURL();
    } catch (java.net.URISyntaxException | java.net.MalformedURLException exception) {
        org.kordakus.sheppard.rule.SheppardInsertRuleFactoryImpl.LOGGER.warn("Unable to create URL to icon for insert rule factory's icon at '{}': {}", iconLocation, exception.getMessage());
        throw new org.kordakus.sheppard.api.SheppardRuntimeException(exception);
    }
}