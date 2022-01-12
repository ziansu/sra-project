public static void reply(java.lang.String content) {
    java.lang.String output = ((com.aktheknight.discordbot.Logger.format.format(com.aktheknight.discordbot.Logger.date)) + " [BOT] ") + content;
    if (DiscordBot.settings.getPrintAllChat()) {
        java.lang.System.out.println(output);
    }
    com.aktheknight.discordbot.Logger.write(output);
}