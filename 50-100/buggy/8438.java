public static void sendChat(net.minecraft.command.ICommandSender sender, java.lang.String msg, java.lang.Object... args) {
    java.lang.String[] lines;
    if (args == null)
        lines = msg.split("\\\\n");
    else
        lines = java.lang.String.format(msg, args).split("\\\\n");
    
    for (java.lang.String line : lines) {
        sender.addChatMessage(new net.minecraft.util.ChatComponentText(line));
    }
}