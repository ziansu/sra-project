private void disableInterface(java.lang.String interfaceName) throws org.eclipse.kura.KuraException {
    org.eclipse.kura.net.admin.monitor.WifiMonitorServiceImpl.s_logger.debug(("Disabling " + interfaceName));
    m_netAdminService.disableInterface(interfaceName);
    m_netAdminService.manageDhcpServer(interfaceName, false);
}