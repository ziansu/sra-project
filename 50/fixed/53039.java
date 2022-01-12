@java.lang.Override
public boolean messagesWaiting() {
    return (messageCount.intValue()) > 0;
}