private java.util.List<java.lang.String> fetchMetaServerIpPorts() {
    java.util.List<java.lang.String> curIpPorts = getMetaServerIpPorts();
    if (com.ctrip.hermes.core.utils.CollectionUtil.isNullOrEmpty(curIpPorts)) {
        if (!(resolveMetaServerDomain())) {
            throw new java.lang.RuntimeException("Can not resolve meta server domain");
        }
    }
    return fetchIpPortsFromExistingMetaServer();
}