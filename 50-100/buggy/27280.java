@org.junit.Test
public void testSingletonClient() {
    rtClient = org.mondemand.RealTimeClient.getInstance("test", "127.0.0.1", 9000);
    org.junit.Assert.assertEquals(100000L, rtClient.getMondemandContent().get(context).get(key2).longValue());
    org.junit.Assert.assertEquals(1000L, rtClient.getMondemandContent().get(context).get(key1).longValue());
}