public org.zstack.header.errorcode.ErrorCode preStartVm(org.zstack.compute.vm.VmInstanceInventory inv) {
    for (org.zstack.compute.vm.VmInstanceStartExtensionPoint ext : startVmExtensions) {
        try {
            java.lang.String err = ext.preStartVm(inv);
            if (err != null) {
                return org.zstack.core.Platform.operr("VmInstanceStartExtensionPoint[%s] refuses to start vm[uuid:%s] because %s", ext.getClass().getName(), inv.getUuid(), err);
            }
        } catch (java.lang.Exception e) {
            org.zstack.compute.vm.VmInstanceExtensionPointEmitter.logger.warn(java.lang.String.format("Unhandled exception while calling %s", ext.getClass().getName()), e);
        }
    }
    return null;
}