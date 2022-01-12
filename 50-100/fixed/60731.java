public void enter() throws java.lang.Exception {
    com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.log.info("Waiting for all nodes entering {}", barrierPath);
    boolean allEntered = barrier.enter(timeout, java.util.concurrent.TimeUnit.SECONDS);
    if (allEntered) {
        com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.log.info("All nodes entered VdcPropBarrier at path {}", barrierPath);
    }else {
        com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.log.warn("Only Part of nodes entered within {} seconds at path {}", timeout, barrierPath);
        throw new java.lang.IllegalStateException("Only Part of nodes entered within timeout");
    }
}