@java.lang.Override
public boolean doesSideBlockRendering(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos, net.minecraft.util.EnumFacing face) {
    com.jaquadro.minecraft.storagedrawers.block.tile.TileEntityDrawers tile = getTileEntity(world, pos);
    if ((tile != null) && ((tile.getEffectiveMaterialSide()) == null))
        return false;
    
    return super.doesSideBlockRendering(state, world, pos, face);
}