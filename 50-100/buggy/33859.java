public static void startBot() {
    bot.Config cfg = new bot.Config();
    boolean isReaded = cfg.readFromConfigFile("config.cfg");
    if (isReaded) {
        bot.wrk.JDA.WrkJDA bot = new bot.wrk.JDA.WrkJDA(cfg.getToken(), cfg.getOwnerId(), cfg.getServerId(), cfg.getTextChannelId(), cfg.getVoiceChannelId(), cfg.getPrefix(), cfg.getCommanderRole());
        bot.start();
    }else {
        java.lang.System.err.println("Config file was not loaded properly, try fix config file and restart");
    }
}