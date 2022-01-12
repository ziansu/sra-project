public void asyncGetUserConversation(java.lang.String userUUID, final com.ppmessage.ppcomlib.model.ConversationsModel.OnGetConversationEvent event) {
    com.ppmessage.sdk.core.bean.common.Conversation find = findByAssignedUUID(userUUID);
    if (find != null) {
        if (event != null) {
            event.onCompleted(find);
        }
        return ;
    }
    conversationAgency.createUserConversation(userUUID, new com.ppmessage.ppcomlib.model.conversations.ConversationAgency.OnCreateConversationEvent() {
        @java.lang.Override
        public void onCompleted(com.ppmessage.sdk.core.bean.common.Conversation conversation) {
            if (conversation != null) {
                add(conversation);
            }
            if (event != null) {
                event.onCompleted(conversation);
            }
        }
    });
}