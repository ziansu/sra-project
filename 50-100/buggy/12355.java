@java.lang.Override
public void releaseDevices(final java.util.Map<org.opendaylight.distributed.tx.api.DTXLogicalTXProviderType, java.util.Set<org.opendaylight.yangtools.yang.binding.InstanceIdentifier<?>>> deviceMap) {
    com.google.common.collect.Maps.asMap(this.txProviderMap.keySet(), new com.google.common.base.Function<org.opendaylight.distributed.tx.api.DTXLogicalTXProviderType, java.lang.Object>() {
        @javax.annotation.Nullable
        @java.lang.Override
        public java.lang.Object apply(@javax.annotation.Nullable
        org.opendaylight.distributed.tx.api.DTXLogicalTXProviderType logicalTXProviderType) {
            txProviderMap.get(logicalTXProviderType).releaseTransactionDevices(deviceMap.get(logicalTXProviderType));
            return null;
        }
    });
}