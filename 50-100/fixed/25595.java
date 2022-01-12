private java.net.URI buildURIForPath(java.lang.String scheme, java.lang.String userInfo, java.lang.String host, int port, java.lang.String path) {
    try {
        return new java.net.URI(scheme, userInfo, host, port, (path + (org.axonframework.springcloud.commandhandling.SpringHttpCommandBusConnector.COMMAND_BUS_CONNECTOR_PATH)), null, null);
    } catch (java.net.URISyntaxException e) {
        org.axonframework.springcloud.commandhandling.SpringHttpCommandBusConnector.LOGGER.error("Failed to build URI for [{}{}{}], with user info [{}] and path [{}]", scheme, host, port, userInfo, org.axonframework.springcloud.commandhandling.SpringHttpCommandBusConnector.COMMAND_BUS_CONNECTOR_PATH, e);
        throw new java.lang.IllegalArgumentException(e);
    }
}