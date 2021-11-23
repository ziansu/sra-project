@java.lang.Override
public void updateConversation(@org.jetbrains.annotations.NotNull
com.criptext.monkeykitui.conversation.MonkeyConversation conversation) {
    com.criptext.monkeychatandroid.models.ConversationItem conversationItem = ((com.criptext.monkeychatandroid.models.ConversationItem) (conversation));
    conversationItem.lastOpen = lastOpen;
    conversationItem.setTotalNewMessage(0);
    conversationItem.setSecondaryText(lastMessageText);
}