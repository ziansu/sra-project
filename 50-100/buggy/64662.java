public void testWriteIsQueuedInChannel() throws java.lang.Exception {
    byte[] bytes = generateBytes(10);
    org.mockito.Mockito.when(selector.onThread()).thenReturn(true);
    assertFalse(writeContext.hasQueuedWriteOps());
    writeContext.queueWriteOperations(new org.elasticsearch.transport.nio.WriteOperation(channel, new org.elasticsearch.common.bytes.BytesArray(bytes), listener));
    assertTrue(writeContext.hasQueuedWriteOps());
}