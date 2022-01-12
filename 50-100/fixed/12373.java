public static int getBlockOrFacadeMetadata(net.minecraft.world.IBlockAccess world, int x, int y, int z, int side) {
    net.minecraft.block.Block blk = world.getBlock(x, y, z);
    if (blk instanceof info.jbcs.minecraft.chisel.api.IFacade) {
        return ((info.jbcs.minecraft.chisel.api.IFacade) (blk)).getFacadeMetadata(world, x, y, z, side);
    }
    return world.getBlockMetadata(x, y, z);
}