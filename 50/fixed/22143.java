public void executeClient(net.minecraft.entity.player.EntityPlayer player) {
    if ((machine) != null)
        machine.useNetworkData(player, Side.CLIENT, packetId, nbt);
    
}