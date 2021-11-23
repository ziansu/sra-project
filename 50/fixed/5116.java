public java.lang.String getDatacenterName() {
    org.eclipse.cmf.occi.multicloud.vmware.connector.VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
    if (vmfolders != null) {
        datacenterName = vmfolders.getDatacentername();
    }
    return this.datacenterName;
}