@java.lang.Override
public boolean onNodeLeft(java.util.UUID nodeId) {
    for (org.apache.ignite.internal.IgniteInternalFuture<?> fut : futures())
        if (isMini(fut)) {
            org.apache.ignite.internal.processors.cache.distributed.GridCacheTxRecoveryFuture.MiniFuture f = ((org.apache.ignite.internal.processors.cache.distributed.GridCacheTxRecoveryFuture.MiniFuture) (fut));
            if (f.nodeId().equals(nodeId))
                f.onNodeLeft();
            
        }
    
    return true;
}