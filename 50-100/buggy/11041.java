private boolean createBridges(org.onosproject.netvirt.configuration.Node node, org.onosproject.net.Network network) throws java.lang.Exception {
    org.onosproject.ovsdb.providers.Status status;
    java.lang.String brInt = org.onosproject.ovsdb.providers.constant.ConfigurationConstants.INTEGRATION_BRIDGE;
    status = this.addBridge(node, brInt, null, null);
    if (!(status.isSuccess())) {
        org.onosproject.ovsdb.providers.impl.CfgAdapterProviderImpl.LOG.debug("{} Bridge Creation Status: {}", brInt, status);
        return false;
    }
    org.onosproject.ovsdb.providers.impl.CfgAdapterProviderImpl.LOG.debug("createNetNetwork: node: {}, status: success", node);
    return true;
}