@java.lang.Override
public org.hornetq.core.server.ServerMessage copy() {
    org.hornetq.core.journal.SequentialFile newfile = storageManager.createFileForLargeMessage(messageID, durable);
    org.hornetq.core.server.ServerMessage newMessage = new org.hornetq.core.persistence.impl.journal.LargeServerMessageImpl(this, properties, newfile, messageID);
    return newMessage;
}