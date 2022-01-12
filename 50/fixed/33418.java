@java.lang.Override
public void success(eu.siacs.conversations.entities.Message message) {
    mXmppConnectionService.resendMessage(message, false);
}