private static void writeBotConfig(com.github.otbproject.otbproject.api.BotConfig config) {
    com.github.otbproject.otbproject.util.JsonHandler.writeValue(com.github.otbproject.otbproject.api.APIConfig.BOT_CONFIG_PATH, config);
}