@java.lang.Override
public java.lang.String getBotUsername() {
    if (configs.containsKey(bots.TelegramBot.USERNAME_KEY))
        return configs.get(bots.TelegramBot.USERNAME_KEY);
    else
        return null;
    
}