public synchronized void removeVirtualAddress(net.ctrdn.stuba.want.swrouter.common.net.IPv4Address address, net.ctrdn.stuba.want.swrouter.module.interfacemanager.NetworkInterface iface) {
    this.virtualAddressMap.remove(address, iface);
}