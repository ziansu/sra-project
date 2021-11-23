public static void log(java.lang.String m) {
    Bot.jda.getTextChannelById(com.tisawesomeness.minecord.Config.getLogChannel()).sendMessage(m).queue();
}