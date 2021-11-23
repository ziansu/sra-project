@java.lang.Override
public void onSuccess(@javax.annotation.Nullable
final java.lang.Void result) {
    org.opendaylight.distributed.tx.impl.spi.DtxImpl.LOG.info("Distributed tx failed for {}. Rollback was successful", perNodeTx.getKey());
    deviceLock.releaseDevices(logicalTxProviderType, commitStatus.keySet());
    distributedSubmitFuture.setException(e);
}