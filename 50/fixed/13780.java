public void mergeInterface(org.opennms.netmgt.model.OnmsIpInterface scannedIface, org.opennms.netmgt.model.events.EventForwarder eventForwarder, boolean deleteMissing) {
    updateSnmpInterface(scannedIface);
    mergeInterfaceAttributes(scannedIface);
    mergeMonitoredServices(scannedIface, eventForwarder, deleteMissing);
}