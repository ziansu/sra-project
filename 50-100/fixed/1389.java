public synchronized void threadReturned(java.lang.String value, long version) {
    (readsReturned)++;
    if (version > (highestVersionRead)) {
        highestVersionRead = version;
        highestVersionResult = value;
    }
    if ((readsReturned) > (((readThreadsCounter) / 2) + 1))
        synchronized(readsWaitOnMe) {
            readsWaitOnMe.notify();
        }
    
}