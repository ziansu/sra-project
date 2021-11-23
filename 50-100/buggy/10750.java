@org.junit.Test
public void shouldProvideLabelScanStoreUpdatesSortedByNodeId() throws java.lang.Exception {
    org.neo4j.kernel.impl.api.index.IndexingService indexing = org.mockito.Mockito.mock(org.neo4j.kernel.impl.api.index.IndexingService.class);
    org.neo4j.unsafe.batchinsert.LabelScanWriter writer = new org.neo4j.kernel.impl.transaction.command.IndexTransactionApplierTest.OrderVerifyingLabelScanWriter(10, 15, 20);
    try (org.neo4j.kernel.impl.transaction.command.IndexTransactionApplier applier = new org.neo4j.kernel.impl.transaction.command.IndexTransactionApplier(indexing, org.neo4j.kernel.impl.api.index.ValidatedIndexUpdates.NONE, org.neo4j.kernel.impl.util.Providers.singletonProvider(writer), org.mockito.Mockito.mock(org.neo4j.kernel.impl.core.CacheAccessBackDoor.class))) {
        applier.visitNodeCommand(node(15));
        applier.visitNodeCommand(node(20));
        applier.visitNodeCommand(node(10));
        applier.apply();
    }
}