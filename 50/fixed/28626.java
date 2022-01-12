public static org.onosproject.vtnrsc.RouterGateway routerGateway(org.onosproject.vtnrsc.TenantNetworkId networkId, boolean enableSnat, java.util.Set<org.onosproject.vtnrsc.FixedIp> externalFixedIps) {
    return new org.onosproject.vtnrsc.RouterGateway(networkId, enableSnat, externalFixedIps);
}