public void clientDoOpenConnection(java.lang.String typedAddress) {
    net.minecraft.nbt.NBTTagCompound request = new net.minecraft.nbt.NBTTagCompound();
    request.setString("typedAddress", typedAddress);
    lc.common.network.packets.LCDHDPacket packet = new lc.common.network.packets.LCDHDPacket(new lc.common.util.math.DimensionPos(this), request);
    LCRuntime.runtime.network().sendToServer(packet);
}