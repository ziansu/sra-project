@net.canarymod.commandsys.TabComplete(commands = { "ban" })
public java.util.List<java.lang.String> banTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return (parameters.length) == 1 ? matchToKnownPlayer(parameters) : ((parameters.length) >= 2) && (parameters[((parameters.length) - 2)].matches("\\d+")) ? matchTo(parameters, new java.lang.String[]{ "hour" , "day" , "week" , "month" }) : null;
}