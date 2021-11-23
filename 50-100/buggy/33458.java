private void syncConversationsFragment() {
    int totalConversations = getState().conversations.size();
    asyncDBHandler.getConversationPage(new com.criptext.monkeychatandroid.models.conversation.task.GetConversationPageTask.OnQueryReturnedListener() {
        @java.lang.Override
        public void onQueryReturned(java.util.List<com.criptext.monkeychatandroid.models.conversation.ConversationItem> conversationPage) {
            getState().conversations.setHasReachedEnd(true);
            getState().conversations.insertConversations(conversationPage, ((conversationPage.size()) == 0));
        }
    }, totalConversations, 0);
}