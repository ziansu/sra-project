public void testWriteIsQueuedInChannel() throws java.lang.Exception {
    org.mockito.Mockito.when(selector.onThread()).thenReturn(true);
    assertFalse(writeContext.hasQueuedWriteOps());
    writeContext.queueWriteOperations(new org.elasticsearch.transport.nio.WriteOperation(channel, new org.elasticsearch.common.bytes.BytesArray(generateBytes(10)), listener));
    assertTrue(writeContext.hasQueuedWriteOps());
}