public java.lang.String getDatacenterName() {
    org.eclipse.cmf.occi.multicloud.vmware.connector.VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
    if (vmfolders != null) {
        return vmfolders.getDatacentername();
    }
    return this.datacenterName;
}