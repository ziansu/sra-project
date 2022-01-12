@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(panda2134.CLG.network.CLGMultiblockMessage message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    java.lang.System.out.println(("onMessage" + (panda2134.CLG.util.ModValue.isServer)));
    if (message.formed) {
        panda2134.CLG.tileentity.TileEntityCLGController tile = ((panda2134.CLG.tileentity.TileEntityCLGController) (net.minecraft.client.Minecraft.getMinecraft().theWorld.getTileEntity(message.x, message.y, message.z)));
        tile.formed = true;
    }
    return null;
}