@java.lang.Override
public void onQueryReturned(java.util.List<com.criptext.monkeychatandroid.models.conversation.ConversationItem> conversationPage) {
    getState().conversations.setHasReachedEnd(true);
    getState().conversations.insertConversations(conversationPage, ((conversationPage.size()) == 0));
}