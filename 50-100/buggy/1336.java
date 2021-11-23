@org.junit.Test
public void testWhenSaslNotAllowedNonSaslHeaderIsInvliad() {
    wireFormat.setAllowNonSaslConnections(false);
    org.apache.activemq.transport.amqp.AmqpHeader nonSaslHeader = new org.apache.activemq.transport.amqp.AmqpHeader();
    org.junit.Assert.assertFalse(wireFormat.isHeaderValid(nonSaslHeader));
    org.apache.activemq.transport.amqp.AmqpHeader saslHeader = new org.apache.activemq.transport.amqp.AmqpHeader();
    saslHeader.setProtocolId(3);
    org.junit.Assert.assertTrue(wireFormat.isHeaderValid(saslHeader));
}