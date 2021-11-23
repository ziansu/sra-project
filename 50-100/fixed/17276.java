@java.lang.Override
public void onCreateGroup(java.lang.String groupMembers, java.lang.String groupName, java.lang.String groupID, java.lang.Exception e) {
    if (e == null) {
        com.criptext.monkeychatandroid.models.ConversationItem conversationItem = new com.criptext.monkeychatandroid.models.ConversationItem(groupID, groupName, java.lang.System.currentTimeMillis(), "Write to this group", 0, true, groupMembers, "", MonkeyConversation.ConversationStatus.empty.ordinal());
        state.conversations.addNewConversation(conversationItem);
    }
}