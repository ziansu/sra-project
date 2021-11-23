@java.lang.Override
public net.minecraft.tileentity.TileEntity createNewTileEntity(net.minecraft.world.World world, int meta) {
    T145.magistics.tiles.machines.TileCrucible crucible = new T145.magistics.tiles.machines.TileCrucible();
    crucible.setTier(meta);
    return crucible;
}