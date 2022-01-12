@java.lang.Override
public net.minecraft.tileentity.TileEntity createNewTileEntity(net.minecraft.world.World world, int meta) {
    return new train.common.tile.TileStopper(meta);
}