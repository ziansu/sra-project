@java.lang.Override
public void onCommand(net.dv8tion.jda.events.message.MessageReceivedEvent e, java.lang.String[] args) {
    if (!(misc.Permissions.getPermissions().isOp(e.getAuthor()))) {
        e.getChannel().sendMessage("Sorry, this command is OP only!");
        return ;
    }
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    java.util.Arrays.asList(args).stream().forEach(builder::append);
    events.commands.LinuxCommand.runLinuxCommand(("python resources/html.py " + (builder.toString())));
}