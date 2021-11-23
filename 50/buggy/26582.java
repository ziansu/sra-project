public void addConversationHeader(codeu.chat.common.ConversationHeader header) {
    conversationHeaders.add(header);
    if (isInitialized) {
        hasConversationModified = true;
    }
}