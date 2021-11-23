public void add(org.araqne.logdb.cep.EventContext ctx) {
    if ((ctx.getExpireTime()) != 0)
        synchronized(expireQueue) {
            expireQueue.add(ctx);
        }
    
    if ((ctx.getTimeoutTime()) != 0)
        synchronized(timeoutQueue) {
            addTimeout(ctx);
        }
    
}