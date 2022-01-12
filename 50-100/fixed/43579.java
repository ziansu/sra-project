@org.junit.Test
public void testProducerPublishUseCorrectPayload() {
    org.mockito.ArgumentCaptor<io.github.tcdl.messages.Message> argument = org.mockito.ArgumentCaptor.forClass(io.github.tcdl.messages.Message.class);
    responder.send(payload);
    verify(mockProducer).publish(argument.capture());
    junit.framework.TestCase.assertEquals(payload, argument.getValue().getPayload());
}