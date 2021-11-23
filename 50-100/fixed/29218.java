@java.lang.Override
public void neighborChanged(net.minecraft.block.state.IBlockState state, net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.Block neighborBlock) {
    if (((!(worldIn.isRemote)) && (state.getValue(de.keridos.floodlights.block.BlockPhantomLight.UPDATE))) && (neighborBlock != (net.minecraft.init.Blocks.AIR))) {
        ((de.keridos.floodlights.tileentity.TileEntityPhantomLight) (worldIn.getTileEntity(pos))).updateAllSources(true);
    }
}