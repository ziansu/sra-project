@net.canarymod.commandsys.TabComplete(commands = { "groupmod permission add" , "groupmod permission remove" , "groupmod permission check" })
public java.util.List<java.lang.String> groupmodPermissionAddRemoveCheckTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    switch (parameters.length) {
        case 1 :
            return matchToGroup(parameters);
        case 2 :
            if (parameters[1].contains(":")) {
                java.lang.String pre = parameters[1].split(":")[0];
                return matchTo(parameters, new java.lang.String[]{ pre.concat(":true") , pre.concat(":false") });
            }
    }
    return null;
}