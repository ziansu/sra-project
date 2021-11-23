@java.lang.Override
public boolean checkPermission(net.minecraft.server.MinecraftServer server, net.minecraft.command.ICommandSender sender) {
    if (sender.canUseCommand(3, "")) {
        java.lang.System.out.println("Can use command");
    }else {
        java.lang.System.out.println("Cannot use command");
    }
    return sender.canUseCommand(3, "");
}