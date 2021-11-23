public void close() {
    logger.info((((this) + " Closing RdmaClient, already closed=") + (closed)));
    if (closed)
        return ;
    
    notifyClose = true;
    eqh.breakEventLoop();
    synchronized(this) {
        while (!(closed)) {
            try {
                wait(100);
            } catch (java.lang.InterruptedException e) {
                logger.error(("exception while waiting to close " + e));
            }
        } 
    }
    logger.info(((this) + " Closed RdmaClient"));
}