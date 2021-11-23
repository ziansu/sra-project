@java.lang.Override
public synchronized void stop() {
    try {
        if ((shuffleServer) != null) {
            shuffleServer.close();
        }
    } catch (java.lang.Exception e) {
        logger.error("Exception when stopping service", e);
    }
    super.stop();
}