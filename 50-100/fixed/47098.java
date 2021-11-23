protected void syncFlushVdcConfigToLocal() throws java.lang.Exception {
    vdcPropBarrier = new com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VdcPropertyBarrier(targetSiteInfo, com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VDC_OP_BARRIER_TIMEOUT);
    vdcPropBarrier.enter();
    try {
        flushVdcConfigToLocal();
    } finally {
        boolean allLeft = vdcPropBarrier.leave();
        if (!allLeft) {
            com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.log.info("wait 1 minute, so all nodes be able to return from leave()");
            java.lang.Thread.sleep(com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.IPSEC_RESTART_DELAY);
        }
    }
    vdcPropBarrier = null;
}