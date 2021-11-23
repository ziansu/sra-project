@java.lang.Override
public void onDataPacket(net.minecraft.network.NetworkManager net, net.minecraft.network.play.server.SPacketUpdateTileEntity packet) {
    super.onDataPacket(net, packet);
    this.worldObj.markBlockRangeForRenderUpdate(this.pos, this.pos);
}