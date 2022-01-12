public boolean executeCommand(me.krickl.memebotj.User.UserHandler sender, java.lang.String[] data) {
    if ((commandHandler) == null) {
    }
    return commandHandler.executeCommand(sender, data);
}