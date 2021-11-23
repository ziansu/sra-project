@org.junit.Test
public void testProducerPublishMethodInvoked() {
    responder.send(payload);
    verify(mockProducer, times(1)).publish(org.mockito.Matchers.anyObject());
}