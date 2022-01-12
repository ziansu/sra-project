public synchronized void beginRead() throws java.lang.InterruptedException {
    java.sql.Timestamp ts = new java.sql.Timestamp(java.lang.System.currentTimeMillis());
    timeStamp.set(ts.getTime());
    readQueue.add(timeStamp.get());
    while ((!(writeQueue.isEmpty())) && ((this.timeStamp.get()) > (writeQueue.peek()))) {
        this.wait();
    } 
}