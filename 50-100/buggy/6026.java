@java.lang.Override
public void onDataPacket(net.minecraft.network.NetworkManager networkManager, net.minecraft.network.play.server.S35PacketUpdateTileEntity packet) {
    net.minecraft.nbt.NBTTagCompound data = packet.getNbtCompound();
    cursorX = java.lang.Math.min(data.getInteger("cursorX"), 79);
    cursorY = java.lang.Math.min(data.getInteger("cursorY"), 49);
    cursorMode = java.lang.Math.min(java.lang.Math.abs(data.getInteger("cursorMode")), 3);
    super.onDataPacket(networkManager, packet);
}