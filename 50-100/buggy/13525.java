public boolean hasBlockingMicroblock(net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos, net.minecraft.util.EnumFacing direction) {
    net.minecraft.tileentity.TileEntity tile = world.getTileEntity(pos);
    if (tile instanceof com.raoulvdberge.refinedstorage.tile.TileMultipartNode) {
        for (mcmultipart.microblock.IMicroblock microblock : ((mcmultipart.microblock.IMicroblockContainerTile) (tile)).getMicroblockContainer().getParts()) {
            if (isBlockingMicroblock(microblock, direction)) {
                return true;
            }
        }
    }
    return false;
}