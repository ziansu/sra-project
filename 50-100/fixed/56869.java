@java.lang.Override
public void handle(com.topicsbot.services.api.telegram.model.Update update) {
    com.topicsbot.services.api.telegram.model.Message message = update.getMessage();
    if (message == null)
        return ;
    
    com.topicsbot.model.chat.Chat chat = chatDAO.find(message.getChatId());
    java.lang.String text = message.getText();
    if (text == null)
        return ;
    
    text = text.trim();
    analysisProvider.index(text, chat);
    updateChatDayStatistics(message, chat);
    updateUserDayStatistics(message, chat);
}