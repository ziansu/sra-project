private void verifyLifecycleEvent(final org.springframework.messaging.Message<?> msg, final com.hazelcast.core.LifecycleEvent.LifecycleState lifecycleState) {
    org.junit.Assert.assertNotNull(msg);
    org.junit.Assert.assertNotNull(msg.getPayload());
    org.junit.Assert.assertTrue(((msg.getPayload()) instanceof com.hazelcast.core.LifecycleEvent));
    org.junit.Assert.assertEquals(lifecycleState, ((com.hazelcast.core.LifecycleEvent) (msg.getPayload())).getState());
}