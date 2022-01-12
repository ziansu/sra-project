public void onMessageReceived(net.dv8tion.jda.events.message.MessageReceivedEvent event) {
    java.lang.System.out.print("[INFO] Toby message recieved!");
    net.dv8tion.jda.entities.MessageChannel channel = event.getChannel();
    net.dv8tion.jda.entities.Message message = event.getMessage();
    java.lang.String id = event.getAuthor().getId();
    core.processMessage(channel, message.getContent(), id);
    if (message.getContent().startsWith("!"))
        message.deleteMessage();
    
}