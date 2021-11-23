public void testEmptyPropertySelector() throws java.lang.Exception {
    int remaining = 5;
    javax.jms.Message message = null;
    consumer = createConsumer("");
    sendMessages();
    while (true) {
        message = consumer.receive(1000);
        if (message == null) {
            break;
        }
        remaining--;
    } 
    assertEquals(remaining, 0);
    consumer.close();
    consumeMessages(remaining);
}