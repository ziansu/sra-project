@java.lang.Override
public void onSuccess(final com.google.common.base.Optional<org.opendaylight.yangtools.yang.binding.DataObject> result) {
    cache.add(new org.opendaylight.distributed.tx.spi.CachedData(instanceIdentifier, result.get(), org.opendaylight.yangtools.yang.data.api.ModifyAction.DELETE));
    try {
        delegate.delete(logicalDatastoreType, instanceIdentifier);
    } catch (java.lang.RuntimeException e) {
        retFuture.setException(e);
    }
    retFuture.set(null);
}