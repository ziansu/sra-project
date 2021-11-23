private static org.telegram.telegrambots.api.methods.send.SendMessage getWrongUsernameMessage(org.telegram.telegrambots.api.objects.Message message) {
    org.telegram.telegrambots.api.methods.send.SendMessage sendMessage = new org.telegram.telegrambots.api.methods.send.SendMessage();
    sendMessage.enableMarkdown(true);
    sendMessage.setChatId(message.getChatId().toString());
    sendMessage.setReplayToMessageId(message.getMessageId());
    org.telegram.telegrambots.api.objects.replykeyboard.ForceReplyKeyboard forceReplyKeyboard = new org.telegram.telegrambots.api.objects.replykeyboard.ForceReplyKeyboard();
    forceReplyKeyboard.setSelective(true);
    sendMessage.setReplayMarkup(forceReplyKeyboard);
    sendMessage.setText(org.telegram.updateshandlers.ChannelHandlers.WRONG_CHANNEL_TEXT);
    sendMessage.enableMarkdown(true);
    return sendMessage;
}