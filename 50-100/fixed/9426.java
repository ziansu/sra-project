public boolean editCommand(java.lang.String modType, java.lang.String newValue, me.krickl.memebotj.User.UserHandler sender) {
    if ((commandHandler) == null) {
    }
    boolean success = false;
    success = commandHandler.editCommand(modType, newValue, sender);
    commandName = commandHandler.getCommandName();
    return success;
}