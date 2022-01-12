@org.junit.Test
public void testVmSnapshotDetails() {
    com.cloud.vm.snapshot.VMSnapshotDetailsVO detailsVO = new com.cloud.vm.snapshot.VMSnapshotDetailsVO(1L, "test", "foo", display);
    vmsnapshotDetailsDao.persist(detailsVO);
    java.util.Map<java.lang.String, java.lang.String> details = vmsnapshotDetailsDao.listDetailsKeyPairs(1L);
    junit.framework.Assert.assertTrue(details.containsKey("test"));
}