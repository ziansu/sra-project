@java.lang.Override
public void onCommand(net.dv8tion.jda.events.message.MessageReceivedEvent e, java.lang.String[] args) {
    if (!(misc.Permissions.getPermissions().isOp(e.getAuthor()))) {
        e.getChannel().sendMessage("Sorry, this command is OP only!");
        return ;
    }
    executeScript(e, new events.commands.DiscordAsOutputStream(e.getTextChannel()), args);
}