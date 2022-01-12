private void failTask(com.vmware.photon.controller.dhcpagent.xenon.service.SubnetIPLeaseTask state, java.lang.Throwable t, com.vmware.xenon.common.Operation postOperation) {
    com.vmware.photon.controller.common.xenon.ServiceUtils.logSevere(this, t);
    if (postOperation == null) {
        com.vmware.photon.controller.common.xenon.TaskUtils.sendSelfPatch(this, state);
    }else {
        postOperation.setBody(state).complete();
    }
}