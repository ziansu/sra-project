@java.lang.Override
public void close() throws java.lang.Exception {
    org.opendaylight.sfc.ofrenderer.SfcOfRenderer.LOG.info("SfcOfRenderer auto-closed");
    try {
        if ((sfcOfFlowProgrammer) != null) {
            sfcOfFlowProgrammer.shutdown();
        }
        if ((pktInRegistration) != null) {
            pktInRegistration.close();
        }
        openflowRspDataListener.close();
    } finally {
        openflowRspDataListener = null;
    }
}