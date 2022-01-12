@java.lang.Override
public void close() {
    listeners.clear();
    listeners = null;
    if ((chatToggleCommand) != null) {
        chatToggleCommand.close();
        chatToggleCommand = null;
    }
    if ((chatListenCommand) != null) {
        chatListenCommand.close();
        chatListenCommand = null;
    }
}