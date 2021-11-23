protected final void decreasePendingVm(org.ovirt.engine.core.common.businessentities.VmStatic vm) {
    org.ovirt.engine.core.compat.Guid vdsId = getCurrentVdsId();
    schedulingManager.clearPendingVm(vm);
    getBlockingQueue(vdsId).offer(java.lang.Boolean.TRUE);
}