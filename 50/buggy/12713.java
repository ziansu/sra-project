private void assertThatOwnedEntryCountEquals(com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> clientMap, long expected) {
    long ownedEntryCount = getOwnedEntryCount(clientMap);
    org.junit.Assert.assertEquals(expected, ownedEntryCount);
}