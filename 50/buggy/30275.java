@java.lang.Override
public void stop() {
    try {
        if ((shuffleServer) != null) {
            shuffleServer.close();
        }
    } catch (java.lang.Exception e) {
        logger.error("Exception when stopping service", e);
    }
}