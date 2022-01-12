@java.lang.Override
public boolean canCommandSenderUseCommand(net.minecraft.command.ICommandSender sender) {
    net.minecraft.entity.player.EntityPlayerMP epm = ((net.minecraft.entity.player.EntityPlayerMP) (sender));
    com.mojang.authlib.GameProfile gp = epm.getGameProfile();
    if ((net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().func_152596_g(gp)) == true) {
        return true;
    }else {
        return false;
    }
}