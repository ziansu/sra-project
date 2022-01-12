private void removeFromGrid() {
    markForRegen();
    for (net.minecraftforge.common.util.ForgeDirection d : net.minecraftforge.common.util.ForgeDirection.VALID_DIRECTIONS)
        _network.removeNode(new cofh.lib.util.position.BlockPosition(xCoord, yCoord, zCoord, d).step(d), true);
    
    _network.removeConduit(this);
    _network = null;
}