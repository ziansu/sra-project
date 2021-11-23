@java.lang.Override
public void processCommand(net.minecraft.command.ICommandSender commandSender, java.lang.String[] pars) {
    if (((pars.length) == 0) || ("?".equals(pars[0]))) {
        sendChat(commandSender, getLoc("help"));
        return ;
    }
    matchCommands(commandSender, this.getCommandSenderAsPlayer(commandSender), pars);
}