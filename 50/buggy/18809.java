public boolean executeCommand(me.krickl.memebotj.User.UserHandler sender, java.lang.String[] data) {
    if ((commandHandler) == null) {
        commandHandler = new me.krickl.memebotj.Commands.CommandHandler(channelHandler, commandName, dbprefix);
    }
    return commandHandler.executeCommand(sender, data);
}