private void syncConversationsFragment() {
    final int totalConversations = getState().conversations.size();
    asyncDBHandler.getConversationPage(new com.criptext.monkeychatandroid.models.conversation.task.GetConversationPageTask.OnQueryReturnedListener() {
        @java.lang.Override
        public void onQueryReturned(java.util.List<com.criptext.monkeychatandroid.models.conversation.ConversationItem> conversationPage) {
            getState().conversations.insertConversations(conversationPage, true);
        }
    }, totalConversations, 0);
}