protected void assertThatOwnedEntryCountIsSmallerThan(com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> clientMap, long expected) {
    long ownedEntryCount = getOwnedEntryCount(clientMap);
    org.junit.Assert.assertTrue(java.lang.String.format("ownedEntryCount should be smaller than %d, but was %d", expected, ownedEntryCount), (ownedEntryCount < expected));
}