private void updatePortProperty(java.util.Map<java.lang.String, java.lang.String> updatedProperties, org.apache.felix.utils.properties.Properties systemDotProperties) {
    java.lang.String protocol = org.codice.ddf.configuration.SystemBaseUrl.getProtocol();
    java.lang.String port = org.codice.ddf.configuration.SystemBaseUrl.getHttpsPort();
    if ((protocol != null) && (protocol.equalsIgnoreCase(org.codice.ddf.admin.core.impl.SystemPropertiesAdmin.HTTP_PROTOCOL))) {
        port = org.codice.ddf.configuration.SystemBaseUrl.getHttpPort();
    }
    systemDotProperties.put(SystemBaseUrl.PORT, port);
    java.lang.System.setProperty(SystemBaseUrl.PORT, port);
}