@java.lang.Override
public void apply(org.apache.ignite.internal.IgniteInternalFuture<org.apache.ignite.internal.processors.cache.distributed.near.GridNearLockResponse> future) {
    if ((future.error()) != null)
        onDone(future.error());
    else {
        try {
            onResult(node.id(), future.get());
        } catch (org.apache.ignite.IgniteCheckedException e) {
            onDone(e);
        }
    }
}