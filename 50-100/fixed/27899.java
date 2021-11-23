@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(co.uk.niadel.tenebrarummagia.common.network.MessageClearEnergyBuffer message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    co.uk.niadel.tenebrarummagia.common.network.MessageClearEnergyBuffer packet = message;
    ((co.uk.niadel.tenebrarummagia.api.energy.IEnergyHandler) (net.minecraft.server.MinecraftServer.getServer().getEntityWorld().getTileEntity(packet.tileEntityX, packet.tileEntityY, packet.tileEntityZ))).getEnergy().setQuantity(0);
    return null;
}