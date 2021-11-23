public static void rebootGuest(com.vmware.vim25.mo.VirtualMachine vm) {
    if ((org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.isToolsInstalled(vm)) && (org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.isToolsRunning(vm))) {
        try {
            vm.rebootGuest();
        } catch (java.rmi.RemoteException ex) {
            org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.LOGGER.error(("Error while rebooting the virtual machine " + (vm.getName())));
            ex.printStackTrace();
        }
    }else {
        org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.LOGGER.error("There is no vmware tools installed and/or running, cant reboot the guest system.");
        org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper.LOGGER.warn("please install vmware tools to use this operation.");
    }
}