@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConvertAndSendWithRequestExchangeNull() {
    org.mockito.Mockito.doNothing().when(this.rabbitTemplate).convertAndSend(requestExchangeName, routingKey, this.requestMessage);
    this.classUnderTest.convertAndSend(null, routingKey, this.requestMessage);
}