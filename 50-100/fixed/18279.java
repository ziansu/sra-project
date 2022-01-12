@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(it.kytech.smartccraft.network.message.MessageTileEnergy message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.tileentity.TileEntity tileEntity = cpw.mods.fml.client.FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.x, message.y, message.z);
    if (tileEntity instanceof it.kytech.smartccraft.tileentity.TileEnergyHandler) {
        ((it.kytech.smartccraft.tileentity.TileEnergyHandler) (tileEntity)).setEnergyStored(message.energy);
    }
    return null;
}