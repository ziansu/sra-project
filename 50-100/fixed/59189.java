@java.lang.Override
public void apply(org.apache.ignite.internal.IgniteInternalFuture<?> f) {
    if (!(enterBusy())) {
        if (log.isDebugEnabled())
            log.debug(("Will not notify eviction future completion (grid is stopping): " + f));
        
        return ;
    }
    try {
        org.apache.ignite.internal.processors.affinity.AffinityTopologyVersion topVer = lockTopology();
        try {
            onFutureCompleted(((org.apache.ignite.internal.processors.cache.GridCacheEvictionManager.EvictionFuture) (f)), topVer);
        } finally {
            unlockTopology();
        }
    } finally {
        busyLock.leaveBusy();
    }
}