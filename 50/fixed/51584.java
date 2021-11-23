private void assertDeletedOrDeferred(int expectedCount) {
    if (org.apache.cassandra.utils.FBUtilities.isWindows())
        assertEquals(expectedCount, getDeferredDeletionCount());
    else
        assertTrue(getSystemSnapshotFiles().isEmpty());
    
}