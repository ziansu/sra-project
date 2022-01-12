@java.lang.Override
public void commit() {
    int oidPage = oidIndex.write();
    int schemaPage1 = schemaIndex.write(txId);
    txContext.setSchemaTxId(schemaIndex.getTxIdOfLastWrite());
    txContext.setSchemaIndexTxId(schemaIndex.getTxIdOfLastWriteThatRequiresRefresh());
    sm.commitInfrastructure(oidPage, schemaPage1, oidIndex.getLastUsedOid(), txId);
    txContext.reset();
    org.zoodb.internal.server.DiskAccessOneFile.LOGGER.info(org.zoodb.internal.server.DiskAccessOneFile.LOCKING_MARKER, "DAOF.commit() lock release");
    sm.getLock().release(this);
}