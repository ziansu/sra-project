@org.junit.Test
public void testProducerWasCreatedForProperTopic() {
    org.mockito.ArgumentCaptor<java.lang.String> argument = org.mockito.ArgumentCaptor.forClass(java.lang.String.class);
    responder.send(payload);
    verify(mockChannelManager).findOrCreateProducer(argument.capture());
    junit.framework.TestCase.assertEquals(originalMessage.getTopics().getResponse(), argument.getValue());
}