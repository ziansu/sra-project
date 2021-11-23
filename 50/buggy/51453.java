@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConvertAndSendWithRequestMessageNull() {
    org.mockito.Mockito.doNothing().when(this.rabbitTemplate).convertAndSend(requestExchangeName, routingKey, this.requestMessage);
    this.classUnderTest.convertAndSend(requestExchangeName, routingKey, null);
}