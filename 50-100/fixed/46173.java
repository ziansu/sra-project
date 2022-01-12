@org.junit.Test
public void getMaster() {
    org.junit.Assert.assertTrue("wrong store state:", dms.roleMap.isEmpty());
    testStore.put(org.onosproject.store.mastership.impl.DistributedMastershipStoreTest.DID1, org.onosproject.store.mastership.impl.DistributedMastershipStoreTest.N1, true, false, false);
    org.junit.Assert.assertEquals("wrong master:", org.onosproject.store.mastership.impl.DistributedMastershipStoreTest.N1, dms.getMaster(org.onosproject.store.mastership.impl.DistributedMastershipStoreTest.DID1));
    org.junit.Assert.assertNull("wrong master:", dms.getMaster(org.onosproject.store.mastership.impl.DistributedMastershipStoreTest.DID2));
}