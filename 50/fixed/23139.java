@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConvertAndSendWithRequestExchangeNull() {
    this.classUnderTest.convertAndSend(null, routingKey, this.requestMessage);
}