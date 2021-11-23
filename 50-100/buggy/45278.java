@java.lang.Override
public boolean init(java.lang.String botId, java.util.Map<java.lang.String, java.lang.String> botConfigs, java.lang.String[] channels) {
    configs = botConfigs;
    try {
        bots.TelegramBot.telegramBotsApi.registerBot(this);
    } catch (org.telegram.telegrambots.exceptions.TelegramApiRequestException e) {
        return false;
    }
    this.botId = botId;
    return true;
}