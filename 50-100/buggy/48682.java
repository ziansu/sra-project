@java.lang.Override
public boolean canCommandSenderUseCommand(net.minecraft.command.ICommandSender pCommandSender) {
    if (((cpw.mods.fml.common.FMLCommonHandler.instance().getEffectiveSide()) == (cpw.mods.fml.relauncher.Side.SERVER)) && (!(cpw.mods.fml.common.FMLCommonHandler.instance().getMinecraftServerInstance().isDedicatedServer())))
        return true;
    
    if (pCommandSender instanceof net.minecraft.entity.player.EntityPlayerMP) {
        net.minecraft.entity.player.EntityPlayerMP tEP = ((net.minecraft.entity.player.EntityPlayerMP) (pCommandSender));
        return net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().func_152596_g(tEP.getGameProfile());
    }
    return false;
}