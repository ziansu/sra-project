@java.lang.Override
public void removeMessageFromUnreadConversations(int conversationId) {
    if (mUnreadConversations.containsKey(conversationId)) {
        org.openhab.habclient.auto.Conversation conversation = mUnreadConversations.get(conversationId);
        conversation.popMessage();
    }
}