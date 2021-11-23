public void poll() {
    try {
        scanDirectory(outboxDir);
        updateTracking();
    } catch (org.openas2.OpenAS2Exception oae) {
        oae.terminate();
    } catch (java.lang.Exception e) {
        logger.error(("Unexpected error occurred polling directory for files to send: " + (outboxDir)), e);
    }
}