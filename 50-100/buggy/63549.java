public static void chat(java.lang.String name, java.lang.String content) {
    java.lang.String output = ((((com.aktheknight.discordbot.Logger.format.format(com.aktheknight.discordbot.Logger.date)) + " [CHAT] ") + name) + ": ") + content;
    if (DiscordBot.settings.getPrintAllChat()) {
        java.lang.System.out.println(output);
    }
    com.aktheknight.discordbot.Logger.write(output);
}