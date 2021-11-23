@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSendMessageForNull_placeHolderMethodTwo() throws java.lang.IllegalArgumentException {
    org.mockito.Mockito.doNothing().when(messageProducer).convertAndSend(replyToAddress, null, responseMessage);
    classUnderTest.sendMessage(exchange, replyToAddress, responseKey, responseMessage, null);
}