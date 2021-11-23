public void addConversationHeader(codeu.chat.common.ConversationHeader header) {
    if (conversationHeaders.contains(header)) {
        return ;
    }
    conversationHeaders.add(header);
    if (isInitialized) {
        hasConversationModified = true;
    }
}