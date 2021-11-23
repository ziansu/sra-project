@java.lang.Override
public com.dynious.refinedrelocation.network.packet.MessageItemAnswer onMessage(com.dynious.refinedrelocation.network.packet.MessageItemRequest message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.tileentity.TileEntity tile = ctx.getServerHandler().playerEntity.getEntityWorld().getTileEntity(message.x, message.y, message.z);
    if ((tile != null) && (tile instanceof com.dynious.refinedrelocation.tileentity.IRelocator)) {
        net.minecraft.item.ItemStack stack = ((com.dynious.refinedrelocation.tileentity.IRelocator) (tile)).getItemStackWithId(message.id);
        return new com.dynious.refinedrelocation.network.packet.MessageItemAnswer(tile, message.id, stack);
    }
    return null;
}