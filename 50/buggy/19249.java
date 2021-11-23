@java.lang.Override
public void removeMessageFromUnreadConversations(int conversationId) {
    if (mUnreadConversations.containsKey(java.lang.Integer.valueOf(conversationId))) {
        org.openhab.habclient.auto.Conversation conversation = mUnreadConversations.get(java.lang.Integer.valueOf(conversationId));
        conversation.popMessage();
    }
}