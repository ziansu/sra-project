public void sendFileMessage(final java.lang.String filePath, final java.lang.String toChatUsername, final int callbackId, final int chatType, final java.lang.String extjson) {
    com.hyphenate.chat.EMMessage message = com.hyphenate.chat.EMMessage.createFileSendMessage(filePath, toChatUsername);
    setMessageType(message, chatType);
    setMessageStatusCallback(message, callbackId);
    if ((extjson != null) && (!(extjson.isEmpty())))
        message.setAttribute("extkey", extjson);
    
    com.hyphenate.chat.EMClient.getInstance().chatManager().sendMessage(message);
}