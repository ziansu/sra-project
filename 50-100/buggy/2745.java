public void sendTextMessage(final java.lang.String content, final java.lang.String toChatUsername, final int callbackId, final int chatType, final java.lang.String extjson) {
    com.hyphenate.chat.EMMessage message = com.hyphenate.chat.EMMessage.createTxtSendMessage(content, toChatUsername);
    setMessageType(message, chatType);
    setMessageStatusCallback(message, callbackId);
    if ((extjson != null) && (!(extjson.empty())))
        message.setAttribute("extkey", extjson);
    
    com.hyphenate.chat.EMClient.getInstance().chatManager().sendMessage(message);
}