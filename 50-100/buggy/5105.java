@java.lang.Override
public void execute(net.minecraft.server.MinecraftServer server, net.minecraft.command.ICommandSender sender, java.lang.String[] args) throws net.minecraft.command.CommandException {
    if ((isPlayerOnly()) && ((sender.getCommandSenderEntity()) instanceof net.minecraft.entity.player.EntityPlayer)) {
    }else
        if ((!(isPlayerOnly())) && (!((sender.getCommandSenderEntity()) instanceof net.minecraft.entity.player.EntityPlayer)))
            wurmcraft.serveressentials.common.chat.ChatHelper.sendMessageTo(sender, Local.PLAYER_ONLY);
        
    
}