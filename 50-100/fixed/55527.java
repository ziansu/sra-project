@org.junit.Test
public void instanceAutobindForPhysical8SocketNotEnoughUneven() {
    java.util.List<org.candlepin.model.Pool> pools = createInstanceBasedPool();
    pools.get(0).setQuantity(7L);
    setupConsumer("8", false);
    assertEquals(0, autobindRules.selectBestPools(consumer, new java.lang.String[]{ productId }, pools, compliance, null, new java.util.HashSet<java.lang.String>(), false).size());
}