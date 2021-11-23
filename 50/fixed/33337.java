public void waitForSignal(long millis) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    synchronized(syncObject) {
        if (!(set))
            syncObject.wait(millis);
        
        if (!(set))
            throw new java.util.concurrent.TimeoutException();
        
    }
}