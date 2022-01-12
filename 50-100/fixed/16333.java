public java.lang.String getPropertyByName(java.lang.String name, java.lang.String defValue) {
    java.lang.String value = ((java.lang.String) (xmlConfiguration.getProperty(name)));
    return (value == null) || ("".equals(value)) ? appProperties.getProperty(name, pluginProperties.getProperty(name, defValue)) : value;
}