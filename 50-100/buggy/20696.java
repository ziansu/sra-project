private int addMessageToUnreadConversations(int conversationId, java.lang.String title, java.lang.String message) {
    org.openhab.habclient.auto.Conversation conversation = mUnreadConversations.get(java.lang.Integer.valueOf(conversationId));
    if (conversation == null) {
        conversation = new org.openhab.habclient.auto.Conversation(conversationId, title, message);
        mUnreadConversations.put(java.lang.Integer.valueOf(conversationId), conversation);
    }
    conversation.putMessage(message);
    return conversationId;
}