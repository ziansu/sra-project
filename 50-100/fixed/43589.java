public static boolean rebootGuest(com.vmware.vim25.mo.VirtualMachine vm) throws java.rmi.RemoteException {
    boolean result = false;
    if ((org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.isToolsInstalled(vm)) && (org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.isToolsRunning(vm))) {
        vm.rebootGuest();
        result = true;
    }else {
        org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.LOGGER.error("There is no vmware tools installed and/or running, cant reboot the guest system.");
        org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.LOGGER.warn("please install vmware tools to use this operation.");
    }
    return result;
}