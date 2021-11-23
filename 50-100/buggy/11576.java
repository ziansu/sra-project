@java.lang.Override
public void onMessageReceived(@android.support.annotation.NonNull
com.criptext.comunication.MOKMessage message) {
    com.criptext.monkeychatandroid.models.MessageItem newItem = processNewMessage(message);
    boolean isMyOwnMsg = newItem.isIncomingMessage();
    updateConversation(newItem.getConversationId(), com.criptext.monkeychatandroid.models.DatabaseHandler.getSecondaryTextByMessageType(newItem, false), (isMyOwnMsg ? MonkeyConversation.ConversationStatus.deliveredMessage : MonkeyConversation.ConversationStatus.receivedMessage), (isMyOwnMsg ? 0 : 1), message.getDatetimeorder(), 0L);
}