private boolean complete(int state, java.lang.Object result) {
    if (result == null) {
        if (!(compareAndSetState(eu.toolchain.async.ConcurrentFuture.Sync.RUNNING, state)))
            return false;
        
        releaseShared(state);
        return true;
    }
    if (!(compareAndSetState(eu.toolchain.async.ConcurrentFuture.Sync.RUNNING, eu.toolchain.async.ConcurrentFuture.Sync.RESULT)))
        return false;
    
    this.result = result;
    setState(state);
    releaseShared(state);
    return true;
}