private boolean onComplete(@org.jetbrains.annotations.Nullable
org.apache.ignite.internal.processors.cache.distributed.near.GridNearTxPrepareResponse res) {
    if ((last) || (tx.isSystemInvalidate()))
        tx.state(org.apache.ignite.transactions.TransactionState.PREPARED);
    
    if (super.onDone(res, err)) {
        cctx.mvcc().removeVersionedFuture(this);
        if ((timeoutObj) != null)
            cctx.time().removeTimeoutObject(timeoutObj);
        
        return true;
    }
    return false;
}