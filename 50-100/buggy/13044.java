@java.lang.Override
public net.minecraftforge.fml.common.network.simpleimpl.IMessage onMessage(com.lothrazar.cyclicmagic.net.PacketSyncPlayerData message, net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    if ((ctx.side) == (net.minecraftforge.fml.relauncher.Side.CLIENT)) {
        com.lothrazar.cyclicmagic.ModMain.IPlayerExtendedProperties props = com.lothrazar.cyclicmagic.ModMain.getPlayerProperties(net.minecraft.client.Minecraft.getMinecraft().thePlayer);
        if (props == null) {
            ModMain.logger.error("IPlayerExtendedProperties NULL PROBLEM");
        }else {
            props.setDataFromNBT(message.tags);
        }
    }
    return null;
}