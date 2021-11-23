@java.lang.Override
public void run() {
    com.google.common.util.concurrent.CheckedFuture<java.lang.Void, org.opendaylight.distributed.tx.api.DTxException> writeFuture;
    if (finalI == errorOccur) {
        internalDtxNetconfTestTx1.setReadException(n0, true);
        writeFuture = netConfOnlyDTx.deleteAndRollbackOnFailure(DTXLogicalTXProviderType.NETCONF_TX_PROVIDER, LogicalDatastoreType.CONFIGURATION, n0, netConfIid1);
    }
    writeFuture = netConfOnlyDTx.putAndRollbackOnFailure(DTXLogicalTXProviderType.NETCONF_TX_PROVIDER, LogicalDatastoreType.CONFIGURATION, n0, new org.opendaylight.distributed.tx.impl.DtxImplTest.TestIid1(), netConfIid1);
    try {
        writeFuture.checkedGet();
    } catch (org.opendaylight.distributed.tx.api.DTxException e) {
        if (finalI != errorOccur)
            org.junit.Assert.fail("get the unexpected exception");
        
    }
}