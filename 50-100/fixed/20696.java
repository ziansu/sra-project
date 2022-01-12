private int addMessageToUnreadConversations(int conversationId, java.lang.String title, java.lang.String message) {
    org.openhab.habclient.auto.Conversation conversation = mUnreadConversations.get(conversationId);
    if (conversation == null) {
        conversation = new org.openhab.habclient.auto.Conversation(conversationId, title, message);
        mUnreadConversations.put(conversationId, conversation);
    }else
        conversation.putMessage(message);
    
    return conversationId;
}