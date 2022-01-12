@java.lang.Override
public net.minecraftforge.fml.common.network.simpleimpl.IMessage onMessage(com.lothrazar.cyclicmagic.net.PacketSyncPlayerData message, net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    if ((ctx.side) == (net.minecraftforge.fml.relauncher.Side.CLIENT)) {
        if ((net.minecraft.client.Minecraft.getMinecraft().thePlayer) == null) {
            return null;
        }
        com.lothrazar.cyclicmagic.ModMain.IPlayerExtendedProperties props = com.lothrazar.cyclicmagic.ModMain.getPlayerProperties(net.minecraft.client.Minecraft.getMinecraft().thePlayer);
        if (props == null) {
            return null;
        }else {
            props.setDataFromNBT(message.tags);
        }
    }
    return null;
}