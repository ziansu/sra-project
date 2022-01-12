@org.junit.Test
public void onEnabledDestinationShouldSendReceivedPayloadThroughGatewayIfStrategyIsForward() throws java.lang.Exception {
    java.lang.String expectedMessage = "You have received a message from Konker device: " + (event.getPayload());
    data.put(EventPublisherSms.SMS_MESSAGE_STRATEGY_PARAMETER_NAME, EventPublisherSms.SMS_MESSAGE_FORWARD_STRATEGY_PARAMETER_VALUE);
    subject.send(event, destinationUri, data, tenant);
    org.mockito.InOrder inOrder = org.mockito.Mockito.inOrder(eventRepository, smsMessageGateway);
    inOrder.verify(smsMessageGateway).send(org.mockito.Matchers.eq(expectedMessage), org.mockito.Matchers.eq(destination.getPhoneNumber()));
    inOrder.verify(eventRepository).push(tenant, event);
}