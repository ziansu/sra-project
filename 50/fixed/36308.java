@java.lang.Override
public void onDataPacket(net.minecraft.network.NetworkManager networkManager, net.minecraft.network.play.server.SPacketUpdateTileEntity packet) {
    super.onDataPacket(networkManager, packet);
    readFromNBT(packet.getNbtCompound());
}