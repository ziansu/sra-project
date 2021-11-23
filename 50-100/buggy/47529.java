@java.lang.Override
public void connect(net.minecraft.world.World world, refinedstorage.api.network.INetworkMaster network) {
    if (network.canRun()) {
        this.network = network;
        this.connected = true;
        this.network.addSlave(this);
        world.notifyNeighborsOfStateChange(pos, getBlockType());
        if (canSendConnectivityUpdate()) {
            refinedstorage.RefinedStorageUtils.updateBlock(world, pos);
        }
    }
}