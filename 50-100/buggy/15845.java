@java.lang.Override
public void onMessageReceived(@android.support.annotation.NonNull
com.criptext.comunication.MOKMessage message) {
    processNewMessage(message);
    boolean isMyOwnMsg = message.getSid().equals(myMonkeyID);
    updateConversation(message.getConversationID(myMonkeyID), getSecondaryTextByMOkMessage(message), (isMyOwnMsg ? MonkeyConversation.ConversationStatus.deliveredMessage : MonkeyConversation.ConversationStatus.receivedMessage), (isMyOwnMsg ? 0 : 1), message.getDatetimeorder());
}