@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(panda2134.CLG.network.CLGMultiblockMessage message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    panda2134.CLG.tileentity.TileEntityCLGController tile = ((panda2134.CLG.tileentity.TileEntityCLGController) (net.minecraft.client.Minecraft.getMinecraft().theWorld.getTileEntity(message.x, message.y, message.z)));
    if (tile == null)
        return null;
    
    if (message.formed) {
        tile.formed = true;
    }else {
        tile.formed = false;
    }
    return null;
}