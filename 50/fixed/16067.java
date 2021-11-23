@java.lang.Override
public void accept(tollbooth.LogMessage message) {
    logMessageQueue.add(message);
}