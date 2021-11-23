public static void reply(java.lang.String content) {
    com.aktheknight.discordbot.Logger.date = new java.util.Date();
    java.lang.String output = ((com.aktheknight.discordbot.Logger.format.format(com.aktheknight.discordbot.Logger.date)) + " [BOT] ") + content;
    if (DiscordBot.settings.getPrintAllChat()) {
        java.lang.System.out.println(output);
    }
    com.aktheknight.discordbot.Logger.write(output);
}