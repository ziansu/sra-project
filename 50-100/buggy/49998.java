private static net.minecraft.block.Block getBlockOrFacade(net.minecraft.world.IBlockAccess world, int x, int y, int z, int side) {
    net.minecraft.block.Block blk = world.getBlock(x, y, z);
    if (blk instanceof info.jbcs.minecraft.chisel.api.IFacade) {
        blk = ((info.jbcs.minecraft.chisel.api.IFacade) (blk)).getFacade(world, x, y, z, side);
    }
    return blk;
}