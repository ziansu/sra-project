@java.lang.Override
public void handleUpdateTag(net.minecraft.nbt.NBTTagCompound tag) {
    super.handleUpdateTag(tag);
    cofh.core.network.PacketHandler.handleNBTPacket(tag);
}