public void runCommand(java.lang.String[] args, net.dv8tion.jda.core.entities.User author, net.dv8tion.jda.core.entities.TextChannel channel, net.dv8tion.jda.core.events.message.MessageReceivedEvent event) {
    if (!(author.getId().equals(caexbot.config.CaexConfiguration.getInstance().getOwner()))) {
        if (!(hasPermission(args, author, channel, event))) {
            noPermission(event);
            return ;
        }
    }
    process(args, author, channel, event);
}