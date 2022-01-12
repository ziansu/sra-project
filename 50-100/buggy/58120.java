public org.apache.tomcat.util.net.SSLHostConfig removeSslHostConfig(java.lang.String hostName) {
    if ((hostName != null) && (hostName.equalsIgnoreCase(getDefaultSSLHostConfigName()))) {
        throw new java.lang.IllegalArgumentException(org.apache.tomcat.util.net.AbstractEndpoint.sm.getString("endpoint.removeDefaultSslHostConfig", hostName));
    }
    org.apache.tomcat.util.net.SSLHostConfig sslHostConfig = sslHostConfigs.remove(hostName);
    unregisterJmx(sslHostConfig);
    return sslHostConfig;
}