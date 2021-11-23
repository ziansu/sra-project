@org.junit.Test
public void testProductClientConfig() throws java.lang.Exception {
    java.util.List<gov.usgs.earthquake.distribution.NotificationReceiver> receivers = client.getReceivers();
    org.junit.Assert.assertEquals(1, receivers.size());
    java.util.List<gov.usgs.earthquake.distribution.NotificationListener> listeners = client.getListeners();
    org.junit.Assert.assertEquals(1, listeners.size());
}