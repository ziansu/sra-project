@org.junit.Before
public final void before() {
    int queueSize = 500;
    messageHandler = new ru.ayaz.UserMessageHandler(queueSize);
}