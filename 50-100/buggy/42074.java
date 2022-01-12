@org.junit.Test
public void testExecuteQueryCommand() {
    org.ovirt.engine.core.common.queries.IdQueryParameters params = getQueryParameters();
    org.mockito.Mockito.when(params.getId()).thenReturn(storageDoaminId);
    org.ovirt.engine.core.bll.snapshots.GetAllDiskSnapshotsByStorageDomainIdQuery<org.ovirt.engine.core.common.queries.IdQueryParameters> query = getQuery();
    query.executeQueryCommand();
    java.util.List<org.ovirt.engine.core.common.businessentities.storage.DiskImage> diskImages = query.getQueryReturnValue().getReturnValue();
    org.junit.Assert.assertEquals("There should be two images returned", diskImages.size(), 2);
    org.junit.Assert.assertEquals("DiskImage should contain the VmSnapshotDescription", diskImages.get(0).getVmSnapshotDescription(), org.ovirt.engine.core.bll.snapshots.GetAllDiskSnapshotsByStorageDomainIdQueryTest.snapshotDescription);
}