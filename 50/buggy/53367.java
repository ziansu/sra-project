@java.lang.Override
public synchronized void sendMessage(de.hff.ChatShared.messagehandling.Message message) {
    try {
        de.hff.ChatShared.messagehandling.messageoutput.MessageOutputstream output = new de.hff.ChatShared.messagehandling.messageoutput.MessageOutputstream(out);
        output.writeMessage(message);
        output.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}