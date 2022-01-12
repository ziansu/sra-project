@java.lang.Override
public void processCommand(net.minecraft.command.ICommandSender p_71515_1_, java.lang.String[] p_71515_2_) {
    if ((p_71515_2_.length) > 1) {
        if (p_71515_2_[0].equalsIgnoreCase("help")) {
            mainserverjt.piratemod.command.commands.HelpCommand.processCommand(p_71515_1_, removeIndexUntil(1, p_71515_2_));
        }
    }else {
        mainserverjt.piratemod.command.ChatColor.sendPrivateMessage(p_71515_1_, (((ChatColor.prefix) + (ChatColor.rood)) + "Use /pm help"));
    }
}