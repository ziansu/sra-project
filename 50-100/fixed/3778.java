@java.lang.Override
public void breakBlock(net.minecraft.world.World world, int x, int y, int z, net.minecraft.block.Block block, int meta) {
    net.minecraft.tileentity.TileEntity te = world.getTileEntity(x, y, z);
    if (te instanceof mcjty.rftools.blocks.screens.ScreenTileEntity) {
        mcjty.rftools.blocks.screens.ScreenTileEntity screenTileEntity = ((mcjty.rftools.blocks.screens.ScreenTileEntity) (te));
        if (screenTileEntity.isLarge()) {
            clearInvisibleBlocks(world, x, y, z, meta);
        }
    }
    super.breakBlock(world, x, y, z, block, meta);
}