@org.junit.Test
public void pullTest() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String QUEUE_NAME = (BASE_QUEUE_NAME) + "Pull";
    service.purgeQueue(QUEUE_NAME);
    service.push(QUEUE_NAME, messageBody);
    com.example.Message message = service.pull(QUEUE_NAME);
    org.junit.Assert.assertNotNull("Failed to retrieve the message!", message);
    org.junit.Assert.assertEquals("Message is not same!", message.getMessageBody(), messageBody);
}