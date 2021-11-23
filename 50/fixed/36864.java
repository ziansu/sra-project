public void manageDhcpServer(java.lang.String interfaceName, boolean enable) throws org.eclipse.kura.KuraException {
    org.eclipse.kura.linux.net.dhcp.DhcpServerManager.disable(interfaceName);
    if (enable) {
        org.eclipse.kura.linux.net.dhcp.DhcpServerManager.enable(interfaceName);
    }
}