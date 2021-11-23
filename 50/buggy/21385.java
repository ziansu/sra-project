@java.lang.Override
public void onDataPacket(net.minecraft.network.NetworkManager net, net.minecraft.network.play.server.S35PacketUpdateTileEntity pkt) {
    net.minecraft.nbt.NBTTagCompound nbt = pkt.getNbtCompound();
    if ((nbt != null) && (nbt.hasKey("ticks"))) {
        this.readFromNBT(nbt);
    }
}