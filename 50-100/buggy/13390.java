private void verifyClientEvent(final org.springframework.messaging.Message<?> msg) {
    org.junit.Assert.assertNotNull(msg);
    org.junit.Assert.assertNotNull(msg.getPayload());
    org.junit.Assert.assertTrue(((msg.getPayload()) instanceof com.hazelcast.core.Client));
    org.junit.Assert.assertEquals(((com.hazelcast.core.Client) (msg.getPayload())).getClientType(), ClientType.JAVA);
    org.junit.Assert.assertNotNull(((com.hazelcast.core.Client) (msg.getPayload())).getSocketAddress());
}