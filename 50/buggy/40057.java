@java.lang.Override
protected void getPacketData(net.minecraft.network.PacketBuffer data) {
    data.writeFloat(heat.T);
    data.writeInt(fuel);
    data.writeFloat(burnRate);
}