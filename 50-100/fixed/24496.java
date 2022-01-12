@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(com.dynious.refinedrelocation.network.packet.MessageItemAnswer message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.tileentity.TileEntity tile = net.minecraft.client.Minecraft.getMinecraft().theWorld.getTileEntity(message.x, message.y, message.z);
    if ((tile != null) && (tile instanceof com.dynious.refinedrelocation.tileentity.IRelocator)) {
        for (com.dynious.refinedrelocation.grid.relocator.TravellingItem item : ((com.dynious.refinedrelocation.tileentity.IRelocator) (tile)).getItems(false)) {
            if ((item.id) == (message.id)) {
                item.itemStack = message.stack;
                return null;
            }
        }
    }
    return null;
}