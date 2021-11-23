public com.vmware.vim25.mo.HostSystem getHostSystem(java.lang.String datacenterName, java.lang.String esxHostName) {
    return com.emc.sa.service.vipr.ViPRExecutionUtils.execute(new com.emc.sa.service.vmware.tasks.FindESXHost(datacenterName, esxHostName));
}