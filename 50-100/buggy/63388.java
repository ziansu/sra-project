@java.lang.Override
public void setNetInterface(org.eclipse.kura.web.shared.model.GwtBSNetInterfaceConfig config) {
    setDirty(true);
    if (((tcpStatus) == null) || ((selectedNetIfConfig) != config)) {
        tcpStatus = tcpTab.getStatus();
    }
    if (config instanceof org.eclipse.kura.web.shared.model.GwtBSWifiNetInterfaceConfig) {
        selectedNetIfConfig = ((org.eclipse.kura.web.shared.model.GwtBSWifiNetInterfaceConfig) (config));
        activeConfig = selectedNetIfConfig.getActiveWifiConfig();
    }
}