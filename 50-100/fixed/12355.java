@java.lang.Override
public void releaseDevices(final java.util.Map<org.opendaylight.distributed.tx.api.DTXLogicalTXProviderType, java.util.Set<org.opendaylight.yangtools.yang.binding.InstanceIdentifier<?>>> deviceMap) {
    for (org.opendaylight.distributed.tx.api.DTXLogicalTXProviderType logicalTXProviderType : deviceMap.keySet()) {
        txProviderMap.get(logicalTXProviderType).releaseTransactionDevices(deviceMap.get(logicalTXProviderType));
    }
}