public void requestMessagesFromServer(java.lang.String conversationId) {
    final com.criptext.monkeykitui.recycler.MessagesList conversationMessages = state.messagesMap.get(conversationId);
    if (conversationId != null) {
        java.lang.String firstTimestamp = "0";
        final com.criptext.monkeykitui.recycler.MonkeyItem firstItem = conversationMessages.getFirstItem();
        if (firstItem != null)
            firstTimestamp = "" + (firstItem.getMessageTimestamp());
        
        getConversationMessages(conversationId, com.criptext.monkeychatandroid.MainActivity.MESS_PERPAGE, firstTimestamp);
    }
}