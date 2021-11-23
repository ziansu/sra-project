@java.lang.Override
public void connect(net.minecraft.world.World world, refinedstorage.api.network.INetworkMaster network) {
    if (network.canRun()) {
        this.network = network;
        this.network.addSlave(this);
        this.connected = true;
        world.notifyNeighborsOfStateChange(pos, getBlockType());
        if (canSendConnectivityUpdate()) {
            refinedstorage.RefinedStorageUtils.updateBlock(world, pos);
        }
    }
}