@org.junit.Test
public void testPersistNullBatches() {
    java.lang.System.out.println("Testing OrionCKANSinkTest.persistBatch (null batches)");
    attrPersistence = "row";
    enableGrouping = "true";
    org.apache.flume.Context context = createContext(attrPersistence, enableGrouping);
    sink.configure(context);
    sink.setChannel(new org.apache.flume.channel.MemoryChannel());
    try {
        sink.persistBatch(null);
    } catch (java.lang.Exception e) {
        fail(e.getMessage());
    } finally {
        assertTrue(true);
    }
}