public java.util.LinkedHashSet<codeu.chat.common.ConversationHeader> getCopyOfConversationHeaders(boolean willBeSaved) {
    if (willBeSaved) {
        hasConversationModified = false;
    }
    return new java.util.LinkedHashSet(conversationHeaders);
}