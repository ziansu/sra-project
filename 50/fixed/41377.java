@java.lang.Override
public java.lang.String getBotUsername() {
    if (this.configs.containsKey(bots.TelegramBot.USERNAME_KEY))
        return this.configs.get(bots.TelegramBot.USERNAME_KEY);
    else
        return null;
    
}