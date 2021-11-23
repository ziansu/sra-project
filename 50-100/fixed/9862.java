@org.junit.Test
public void testStart() {
    java.lang.System.out.println("Testing OrionCKANSink.start");
    attrPersistence = "row";
    enableGrouping = "true";
    org.apache.flume.Context context = createContext(attrPersistence, enableGrouping);
    sink.configure(context);
    sink.setChannel(new org.apache.flume.channel.MemoryChannel());
    sink.start();
    assertTrue(((sink.getPersistenceBackend()) != null));
    assertEquals(LifecycleState.START, sink.getLifecycleState());
}