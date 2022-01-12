public static void markAsVirtualMachine(com.vmware.vim25.mo.VirtualMachine vmTemplate, com.vmware.vim25.mo.HostSystem host, com.vmware.vim25.mo.ResourcePool pool) {
    if (!(vmTemplate.getConfig().isTemplate())) {
        org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.LOGGER.warn("This virtual machine is not a template.");
        return ;
    }
    try {
        vmTemplate.markAsVirtualMachine(pool, host);
    } catch (java.rmi.RemoteException ex) {
        org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.LOGGER.error(("Error while marking a template as a virtual machine : " + (vmTemplate.getName())));
        ex.printStackTrace();
    }
}