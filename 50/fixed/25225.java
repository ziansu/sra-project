@java.lang.Override
public java.lang.AutoCloseable createInstance() {
    org.opendaylight.vpnservice.fibmanager.FibManagerProvider provider = new org.opendaylight.vpnservice.fibmanager.FibManagerProvider();
    provider.setMdsalManager(getMdsalutilDependency());
    provider.setVpnmanager(getVpnmanagerDependency());
    getBrokerDependency().registerProvider(provider);
    return provider;
}