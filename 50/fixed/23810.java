@net.canarymod.commandsys.TabComplete(commands = { "deop" })
public java.util.List<java.lang.String> deopTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] args) {
    return (args.length) == 1 ? matchTo(args, net.canarymod.Canary.ops().getOps()) : null;
}