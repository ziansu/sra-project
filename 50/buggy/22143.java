public void executeClient(net.minecraft.entity.player.EntityPlayer player) {
    machine.useNetworkData(player, Side.CLIENT, packetId, nbt);
}