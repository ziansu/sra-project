public static boolean markAsVirtualMachine(com.vmware.vim25.mo.VirtualMachine vmTemplate, com.vmware.vim25.mo.HostSystem host, com.vmware.vim25.mo.ResourcePool pool) throws java.rmi.RemoteException {
    boolean result = false;
    if (!(vmTemplate.getConfig().isTemplate())) {
        return result;
    }
    vmTemplate.markAsVirtualMachine(pool, host);
    result = true;
    return result;
}