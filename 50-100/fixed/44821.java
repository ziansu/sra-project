private java.util.List<org.eclipse.kura.net.NetConfig> getNetConfigs(org.eclipse.kura.net.NetInterfaceConfig<? extends org.eclipse.kura.net.NetInterfaceAddressConfig> netInterfaceConfig) {
    java.util.List<org.eclipse.kura.net.NetConfig> netConfigs = null;
    if (netInterfaceConfig != null) {
        java.util.List<? extends org.eclipse.kura.net.NetInterfaceAddressConfig> netInterfaceAddressConfigs = netInterfaceConfig.getNetInterfaceAddresses();
        if ((netInterfaceAddressConfigs != null) && ((netInterfaceAddressConfigs.size()) > 0)) {
            for (org.eclipse.kura.net.NetInterfaceAddressConfig netInterfaceAddressConfig : netInterfaceAddressConfigs) {
                netConfigs = netInterfaceAddressConfig.getConfigs();
            }
        }
    }
    return netConfigs;
}