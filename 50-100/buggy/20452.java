public void run() {
    while (true) {
        checkForRetransmissions();
        synchronized(lock) {
            long waitStart = java.lang.System.currentTimeMillis();
            long now = waitStart;
            while ((waitStart + (uk.ac.imperial.lsds.seep.processingunit.Dispatcher.RETRANSMIT_CHECK_INTERVAL)) < now) {
                try {
                    lock.wait((now - (waitStart + (uk.ac.imperial.lsds.seep.processingunit.Dispatcher.RETRANSMIT_CHECK_INTERVAL))));
                } catch (java.lang.InterruptedException e) {
                }
                now = java.lang.System.currentTimeMillis();
            } 
        }
    } 
}