@java.lang.Override
public void close() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    org.opendaylight.sfc.ofrenderer.SfcOfRenderer.LOG.info("SfcOfRenderer auto-closed");
    try {
        if ((sfcOfFlowProgrammer) != null) {
            sfcOfFlowProgrammer.shutdown();
        }
        if ((pktInRegistration) != null) {
            pktInRegistration.close();
        }
        openflowRspDataListener.close();
    } catch (java.lang.Exception e) {
        org.opendaylight.sfc.ofrenderer.SfcOfRenderer.LOG.error("SfcOfRenderer auto-closed exception {}", e.getMessage());
    }
}