@java.lang.Override
public void onFailure(final java.lang.Throwable t) {
    org.opendaylight.distributed.tx.impl.spi.DtxImpl.LOG.warn("Distributed tx filed. Rollback FAILED. Device(s) state is unknown", t);
    distributedSubmitFuture.setException(t);
    deviceLock.releaseDevices(logicalTxProviderType, commitStatus.keySet());
}