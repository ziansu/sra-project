@java.lang.Override
public void onDataPacket(net.minecraft.network.NetworkManager net, net.minecraft.network.play.server.S35PacketUpdateTileEntity pkt) {
    net.minecraft.nbt.NBTTagCompound tagCompound = pkt.getNbtCompound();
    readFromNBT(tagCompound);
    this.worldObj.markBlockForUpdate(this.pos);
}