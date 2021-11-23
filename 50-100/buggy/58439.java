public static com.creativemd.littletiles.common.tileentity.TileEntityLittleTiles loadTe(net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    if ((world == null) || (com.creativemd.littletiles.common.blocks.BlockTile.loadingTileEntityFromWorld))
        return null;
    
    com.creativemd.littletiles.common.blocks.BlockTile.loadingTileEntityFromWorld = true;
    net.minecraft.tileentity.TileEntity tileEntity = null;
    try {
        tileEntity = world.getTileEntity(pos);
    } catch (java.lang.Exception e) {
        return null;
    }
    com.creativemd.littletiles.common.blocks.BlockTile.loadingTileEntityFromWorld = false;
    if (tileEntity instanceof com.creativemd.littletiles.common.tileentity.TileEntityLittleTiles)
        return ((com.creativemd.littletiles.common.tileentity.TileEntityLittleTiles) (tileEntity));
    
    return null;
}