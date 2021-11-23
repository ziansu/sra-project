public void mergeInterface(org.opennms.netmgt.model.OnmsIpInterface scannedIface, org.opennms.netmgt.model.events.EventForwarder eventForwarder, boolean deleteMissing) {
    mergeInterfaceAttributes(scannedIface);
    updateSnmpInterface(scannedIface);
    mergeMonitoredServices(scannedIface, eventForwarder, deleteMissing);
}