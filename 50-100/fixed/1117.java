@net.canarymod.commandsys.TabComplete(commands = { "reservelist" })
public java.util.List<java.lang.String> reservelistTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return (parameters.length) == 1 ? matchTo(parameters, new java.lang.String[]{ "add" , "remove" }) : (parameters.length) == 2 ? parameters[0].equals("remove") ? matchTo(parameters, net.canarymod.Canary.reservelist().getReservations()) : parameters[0].equals("add") ? matchToKnownPlayer(parameters) : null : null;
}