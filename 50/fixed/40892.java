protected void syncFlushVdcConfigToLocal() throws java.lang.Exception {
    com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VdcPropertyBarrier vdcBarrier = new com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VdcPropertyBarrier(targetSiteInfo, com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VDC_RPOP_BARRIER_TIMEOUT);
    try {
        vdcBarrier.enter();
        flushVdcConfigToLocal();
    } finally {
        vdcBarrier.leave();
    }
}