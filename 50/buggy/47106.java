public com.chat.server.conversations.Conversation createConversation() {
    int id = idGenerator.getID();
    com.chat.server.conversations.Conversation conversation = new com.chat.server.conversations.Conversation(id);
    conversations.add(conversation);
    return conversation;
}