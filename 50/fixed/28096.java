@java.lang.Override
public void onMessageFound(eu.siacs.conversations.entities.Message message) {
    processSending(message, false);
}