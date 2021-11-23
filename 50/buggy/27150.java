public me.krickl.memebotj.Commands.CommandHandler getCH() {
    if ((commandHandler) == null) {
        commandHandler = new me.krickl.memebotj.Commands.CommandHandler(channelHandler, commandName, dbprefix);
    }
    return commandHandler;
}