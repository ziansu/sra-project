private void failTask(com.vmware.photon.controller.dhcpagent.xenon.service.SubnetIPLeaseTask state, java.lang.Throwable t, com.vmware.xenon.common.Operation operation) {
    com.vmware.photon.controller.common.xenon.ServiceUtils.logSevere(this, t);
    if (operation == null) {
        com.vmware.photon.controller.common.xenon.TaskUtils.sendSelfPatch(this, state);
    }else {
        operation.setBody(state).complete();
    }
}