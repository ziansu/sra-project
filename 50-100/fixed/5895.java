private synchronized boolean readWait() {
    int waitcount = 10;
    while ((waiting) > 0) {
        try {
            wait(1000);
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
        }
        if ((waitcount--) < 0) {
            jmri.jmrit.operations.rollingstock.engines.NceConsistEngines.log.error("read timeout");
            syncOK = false;
            return false;
        }
    } 
    return true;
}