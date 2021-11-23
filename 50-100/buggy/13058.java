@java.lang.Override
public void opened() {
    try {
        while ((product.getProductState(vm)) == (ch.admin.vbs.cube.core.vm.IVmProduct.VmProductState.STARTING)) {
            java.lang.Thread.sleep(500);
        } 
        product.connectNic(vm, true);
    } catch (java.lang.Exception e) {
        ch.admin.vbs.cube.core.vm.ctrtasks.Start.LOG.error("VM's VPN was opened but we failed to connect VM's NIC", e);
        vm.setVpnState(VmVpnState.NOT_CONNECTED);
        vmModel.fireVmStateUpdatedEvent(vm);
    }
    vm.setVpnState(VmVpnState.CONNECTED);
    vmModel.fireVmStateUpdatedEvent(vm);
}