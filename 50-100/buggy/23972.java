public void searchController(net.minecraft.world.World world) {
    visited.clear();
    refinedstorage.tile.TileController newController = refinedstorage.tile.ControllerSearcher.search(worldObj, pos, visited);
    if ((controller) == null) {
        if (newController != null) {
            onConnected(world, newController);
        }
    }else {
        if (newController == null) {
            onDisconnected(world);
        }
    }
}