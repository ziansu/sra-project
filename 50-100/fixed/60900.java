public void run() {
    try {
        openChannel();
    } catch (java.io.IOException ex) {
        logger.fatal("Could not fücking kreate the UDP fuckin socket dings");
        logger.fatal(ex);
        return ;
    }
    while (true) {
        if (membershipKey.isValid()) {
            onRead();
        }
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException ex) {
            logger.warn("Router got interrupted");
            logger.warn(ex);
            return ;
        }
    } 
}