@org.junit.Test
public void testWhenSaslAllowedNonSaslHeaderIsValid() {
    wireFormat.setAllowNonSaslConnections(true);
    org.apache.activemq.transport.amqp.AmqpHeader nonSaslHeader = new org.apache.activemq.transport.amqp.AmqpHeader();
    org.junit.Assert.assertTrue(wireFormat.isHeaderValid(nonSaslHeader, false));
    org.apache.activemq.transport.amqp.AmqpHeader saslHeader = new org.apache.activemq.transport.amqp.AmqpHeader();
    saslHeader.setProtocolId(3);
    org.junit.Assert.assertTrue(wireFormat.isHeaderValid(saslHeader, false));
}