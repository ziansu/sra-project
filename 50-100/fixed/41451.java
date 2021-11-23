@org.junit.Test
public void testSender() {
    java.util.List<com.bavelsoft.broccolies.OverrideTest.Event> events = com.google.common.collect.Lists.newArrayList();
    com.bavelsoft.broccolies.OverrideTest_EventSender sender = new com.bavelsoft.broccolies.OverrideTest_EventSender(events::add, () -> {
    }, null);
    sender.num(1).str("str").send();
    new com.bavelsoft.broccolies.OverrideTest_EventExpecter(events).str("str").num(1).counter(1).expect();
}