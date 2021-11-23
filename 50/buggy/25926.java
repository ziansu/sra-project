@java.lang.Override
public void processMessage(final com.quickblox.chat.QBGroupChat groupChat, final com.quickblox.chat.model.QBChatMessage chatMessage) {
    log(((("group chat: " + (groupChat.getDialogId())) + ", processMessage: ") + (chatMessage.getBody())));
}