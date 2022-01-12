private org.eclipse.kura.net.NetConfigIP4 getIP4config(org.eclipse.kura.core.net.WifiInterfaceConfigImpl wifiInterfaceConfig) {
    org.eclipse.kura.net.NetConfigIP4 netConfigIP4 = null;
    if (wifiInterfaceConfig != null) {
        loop : for (org.eclipse.kura.net.wifi.WifiInterfaceAddressConfig wifiInterfaceAddressConfig : wifiInterfaceConfig.getNetInterfaceAddresses()) {
            for (org.eclipse.kura.net.NetConfig netConfig : wifiInterfaceAddressConfig.getConfigs()) {
                if (netConfig instanceof org.eclipse.kura.net.NetConfigIP4) {
                    netConfigIP4 = ((org.eclipse.kura.net.NetConfigIP4) (netConfig));
                    break loop;
                }
            }
        }
    }
    return netConfigIP4;
}