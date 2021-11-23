@java.lang.Override
public net.minecraft.network.Packet getDescriptionPacket() {
    net.minecraft.nbt.NBTTagCompound nbt = getTileData();
    writeToNBT(nbt);
    return new net.minecraft.network.play.server.S35PacketUpdateTileEntity(this.pos, getBlockMetadata(), nbt);
}