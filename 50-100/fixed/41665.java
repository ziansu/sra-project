public void joinConversation(java.lang.String name, java.lang.String password) {
    final codeu.chat.common.ConversationSummary previous = clientContext.conversation.getCurrent();
    codeu.chat.common.ConversationSummary newCurrent;
    clientContext.conversation.joinConversation(name, password);
    newCurrent = clientContext.conversation.getCurrent();
    if ((newCurrent != null) && (newCurrent != previous)) {
        clientContext.conversation.updateAllConversations(true);
        clientContext.message.resetCurrent(true);
    }
}