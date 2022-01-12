private void disableInterface(java.lang.String interfaceName) throws java.lang.Exception {
    m_netAdminService.disableInterface(interfaceName);
    this.m_netAdminService.manageDhcpServer(interfaceName, false);
}