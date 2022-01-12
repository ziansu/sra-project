@java.lang.Override
public void onDataPacket(net.minecraft.network.NetworkManager net, net.minecraft.network.play.server.SPacketUpdateTileEntity packet) {
    super.onDataPacket(net, packet);
    readFromNBT(packet.getNbtCompound());
    net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
    world.notifyBlockUpdate(pos, state, state, 3);
}