@java.lang.Override
public synchronized void sendMessage(de.hff.ChatShared.messagehandling.Message message) {
    try {
        output.writeMessage(message);
        output.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}