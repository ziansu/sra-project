private static com.creatubbles.ctbmod.common.painting.TilePainting getDataPainting(net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    net.minecraft.tileentity.TileEntity te = world.getTileEntity(pos);
    if (te instanceof com.creatubbles.ctbmod.common.painting.TilePainting) {
        return ((com.creatubbles.ctbmod.common.painting.TilePainting) (te));
    }else
        if (te instanceof com.creatubbles.ctbmod.common.painting.TileDummyPainting) {
            return ((com.creatubbles.ctbmod.common.painting.TileDummyPainting) (te)).getDataTile();
        }
    
    return null;
}