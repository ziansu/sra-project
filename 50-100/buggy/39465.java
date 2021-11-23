@java.lang.Override
public boolean lockDevices(final java.util.Map<org.opendaylight.distributed.tx.api.DTXLogicalTXProviderType, java.util.Set<org.opendaylight.yangtools.yang.binding.InstanceIdentifier<?>>> deviceMap) {
    boolean allLocked = true;
    synchronized(this) {
        for (org.opendaylight.distributed.tx.api.DTXLogicalTXProviderType t : deviceMap.keySet()) {
            if (this.txProviderMap.get(t).lockTransactionDevices(deviceMap.get(t))) {
                allLocked = false;
                break;
            }
        }
        if (!allLocked) {
            this.releaseDevices(deviceMap);
        }
    }
    return allLocked;
}