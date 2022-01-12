public static void processCommand(net.minecraft.command.ICommandSender p_71515_1_, java.lang.String[] removeIndexUntil) {
    if (p_71515_1_ instanceof net.minecraft.entity.player.EntityPlayer) {
        mainserverjt.piratemod.command.ChatColor.sendPrivateMessage(p_71515_1_, ((mainserverjt.piratemod.command.ChatColor.prefix) + "List Of Commands:"));
        for (java.lang.String s : mainserverjt.piratemod.command.commands.HelpCommand.bestaandeCommands) {
            mainserverjt.piratemod.command.ChatColor.sendPrivateMessage(p_71515_1_, s);
        }
    }else {
    }
}