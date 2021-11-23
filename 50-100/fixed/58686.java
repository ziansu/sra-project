private void verifyMembershipEvent(final org.springframework.messaging.Message<?> msg, final int membershipEvent) {
    org.junit.Assert.assertNotNull(msg);
    org.junit.Assert.assertNotNull(msg.getPayload());
    org.junit.Assert.assertTrue(((msg.getPayload()) instanceof com.hazelcast.core.MembershipEvent));
    org.junit.Assert.assertEquals(membershipEvent, ((com.hazelcast.core.MembershipEvent) (msg.getPayload())).getEventType());
    org.junit.Assert.assertNotNull(((com.hazelcast.core.MembershipEvent) (msg.getPayload())).getMember());
}