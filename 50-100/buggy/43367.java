public synchronized void beginRead() throws java.lang.InterruptedException {
    java.sql.Timestamp ts = new java.sql.Timestamp(java.lang.System.currentTimeMillis());
    timeStamp.set(ts.getTime());
    readQueue.add(java.lang.Thread.currentThread().getId());
    while ((this.timeStamp.get()) >= (writeQueue.peek())) {
        this.wait();
    } 
}