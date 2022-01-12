@java.lang.Override
public net.snet.crm.domain.shared.data.Data fetchDhcpWirelessConnection(java.lang.String master, java.lang.String mac) {
    mac = mac.toUpperCase();
    net.snet.crm.infrastructure.network.DefaultNetworkService.logger.debug("fetching DHCP wireless connection info for '{}', '{}'", master, mac);
    final java.lang.String output = net.snet.crm.infrastructure.system.SystemCommandRunner.executeSystemCommandWithResult(commandFactory.systemCommand("fetchDhcpWirelessConnection", "-m", master, "-a", mac));
    return parseDhcpWirelessConnection(output);
}