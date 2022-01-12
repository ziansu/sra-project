public void closeStreamer() throws java.io.IOException {
    streamerClosed = true;
    synchronized(dataQueue) {
        while (((dataQueue.size()) > 0) || (!(finished))) {
            try {
                dataQueue.wait(1000);
            } catch (java.lang.InterruptedException e) {
                DFSClient.LOG.warn("Caught exception ", e);
            }
        } 
    }
}