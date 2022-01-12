@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(cpw.mods.fml.common.network.simpleimpl.IMessage message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    if (message instanceof co.uk.niadel.tenebrarummagia.common.network.MessageClearEnergyBuffer) {
        co.uk.niadel.tenebrarummagia.common.network.MessageClearEnergyBuffer packet = ((co.uk.niadel.tenebrarummagia.common.network.MessageClearEnergyBuffer) (message));
        ((co.uk.niadel.tenebrarummagia.api.energy.IEnergyHandler) (net.minecraft.server.MinecraftServer.getServer().getEntityWorld().getTileEntity(packet.tileEntityX, packet.tileEntityY, packet.tileEntityZ))).getEnergy().setQuantity(0);
    }
    return null;
}