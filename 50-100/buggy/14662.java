private void handleInterfaceUpdate(org.onosproject.netvirt.configuration.Node node, java.lang.String uuid, org.onosproject.ovsdb.lib.schema.openswitch.Interface intf) {
    org.onosproject.ovsdb.providers.impl.CfgAdapterProviderImpl.LOG.trace("Interface update of node: {}, uuid: {}", node, uuid);
    org.onosproject.net.Network network = getTenantNetwork(intf);
    if (network != null) {
        if (createLocalNetwork(node, network)) {
            networkingProvider.handleInterfaceUpdate(network, node, intf);
        }
    }else {
        org.onosproject.ovsdb.providers.impl.CfgAdapterProviderImpl.LOG.debug("No tenant network found on node: {}, uuid: {} for interface: {}", node, uuid, intf);
    }
}