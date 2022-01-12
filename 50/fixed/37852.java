@org.junit.Test
public void shouldSendTheMessageFromConsole() throws java.io.IOException {
    com.db.javaschool2016.client.Sender sender = org.mockito.Mockito.mock(com.db.javaschool2016.client.Sender.class);
    sender.sendMessage("test message");
    org.mockito.Mockito.verify(sender).sendMessage("test message");
}