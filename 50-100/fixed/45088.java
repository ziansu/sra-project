@java.lang.Override
public void onMessageReceived(net.dv8tion.jda.events.message.MessageReceivedEvent event) {
    if ((event.getMessage().getContent().startsWith(Constants.COMMAND_PREFIX)) && ((event.getMessage().getAuthor().getId()) != (event.getJDA().getSelfInfo().getId()))) {
        com.xelitexirish.logbot.LogBot.handleCommand(LogBot.parser.parse(event.getMessage().getContent().toLowerCase(), event));
    }
    com.xelitexirish.logbot.handlers.DiscordLogHandler.onMessageRecieved(event);
}