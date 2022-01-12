@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(it.kytech.smartccraft.network.message.MessageTileEnergy message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.tileentity.TileEntity tileEntity = cpw.mods.fml.client.FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.x, message.y, message.z);
    it.kytech.smartccraft.util.LogHelper.info("Message Energy");
    if (tileEntity instanceof it.kytech.smartccraft.tileentity.TileEnergyHandler) {
        ((it.kytech.smartccraft.tileentity.TileEnergyHandler) (tileEntity)).setEnergyStored(message.energy);
        it.kytech.smartccraft.util.LogHelper.info(("Message Energy Received: " + (((it.kytech.smartccraft.tileentity.TileEnergyHandler) (tileEntity)).getEnergyStored())));
    }
    return null;
}