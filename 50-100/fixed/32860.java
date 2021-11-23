@java.lang.Override
public void onSuccess(final com.google.common.base.Optional<T> result) {
    cache.add(new org.opendaylight.distributed.tx.spi.CachedData(instanceIdentifier, result.get(), org.opendaylight.yangtools.yang.data.api.ModifyAction.REPLACE));
    try {
        delegate.put(logicalDatastoreType, instanceIdentifier, t);
    } catch (java.lang.RuntimeException e) {
        retFuture.setException(e);
        return ;
    }
    retFuture.set(null);
}