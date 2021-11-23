@java.lang.Override
public java.util.List<java.lang.String> addTabCompletionOptions(final net.minecraft.command.ICommandSender icommandsender, final java.lang.String[] astring) {
    if ((astring.length) <= 1) {
        return getListOfStringsMatchingLastWord(astring, "bubu", "t", "me", "tell", "msg");
    }else
        if ((astring.length) <= 2) {
            return getListOfStringsMatchingLastWord(astring, net.minecraft.server.MinecraftServer.getServer().getAllUsernames());
        }else {
            return null;
        }
    
}