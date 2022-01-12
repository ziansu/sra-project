@org.junit.Test
public void testStart() {
    java.lang.System.out.println("Testing OrionCKANSink.start");
    java.lang.String attrPersistence = "row";
    java.lang.String enableGrouping = "true";
    org.apache.flume.Context context = createContext(attrPersistence, enableGrouping);
    sink.configure(context);
    sink.setChannel(new org.apache.flume.channel.MemoryChannel());
    sink.start();
    assertTrue(((sink.getPersistenceBackend()) != null));
    assertEquals(LifecycleState.START, sink.getLifecycleState());
}