@java.lang.Override
public boolean verifyWifiCredentials(org.eclipse.kura.web.shared.model.GwtXSRFToken xsrfToken, java.lang.String interfaceName, org.eclipse.kura.web.shared.model.GwtWifiConfig gwtWifiConfig) throws org.eclipse.kura.web.shared.GwtKuraException {
    checkXSRFToken(xsrfToken);
    org.eclipse.kura.net.NetworkAdminService nas = org.eclipse.kura.web.server.util.ServiceLocator.getInstance().getService(org.eclipse.kura.net.NetworkAdminService.class);
    org.eclipse.kura.net.wifi.WifiConfig wifiConfig = getWifiConfig(gwtWifiConfig);
    return nas.verifyWifiCredentials(interfaceName, wifiConfig, 60);
}