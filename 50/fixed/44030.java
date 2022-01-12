public static void log(java.lang.String m) {
    if (!(com.tisawesomeness.minecord.Config.getLogChannel().equals("0"))) {
        Bot.jda.getTextChannelById(com.tisawesomeness.minecord.Config.getLogChannel()).sendMessage(m).queue();
    }
}