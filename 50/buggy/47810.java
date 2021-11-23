@java.lang.Override
public void handle(java.lang.String line) {
    com.keedio.tailer.listener.impl.LogFileEventListener.LOGGER.info(("New line: " + line));
}