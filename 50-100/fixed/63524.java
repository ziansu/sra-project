@java.lang.Override
public void close() throws java.io.IOException {
    try {
        super.close();
    } catch (java.lang.Exception e) {
        org.apache.flink.languagebinding.api.java.python.streaming.LOG.error(("Exception occurred while closing Streamer. :" + (e.getMessage())));
    }
    if (!(debug)) {
        destroyProcess();
    }
    if ((shutdownThread) != null) {
        java.lang.Runtime.getRuntime().removeShutdownHook(shutdownThread);
    }
}