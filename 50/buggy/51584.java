private void assertDeletedOrDeferred(int expectedCount) {
    if (org.apache.cassandra.utils.FBUtilities.isWindows())
        org.junit.Assert.assertEquals(expectedCount, getDeferredDeletionCount());
    else
        org.junit.Assert.assertTrue(getSystemSnapshotFiles().isEmpty());
    
}