private java.lang.String getRequestedDriver(net.serenitybdd.jbehave.Meta metaData) {
    if (metaData == null) {
        return null;
    }
    if (org.codehaus.plexus.util.StringUtils.isNotEmpty(metaData.getProperty("driver"))) {
        return metaData.getProperty("driver");
    }
    if ((systemConfiguration.getDriverType()) != null) {
        return systemConfiguration.getDriverType().toString();
    }
    return null;
}