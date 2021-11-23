public void add(org.araqne.logdb.cep.EventContext ctx) {
    synchronized(expireQueue) {
        if ((ctx.getExpireTime()) != 0)
            expireQueue.add(ctx);
        
    }
    synchronized(timeoutQueue) {
        if ((ctx.getTimeoutTime()) != 0)
            addTimeout(ctx);
        
    }
}