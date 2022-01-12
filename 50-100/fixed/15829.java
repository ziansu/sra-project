@java.lang.Override
public net.minecraft.block.state.IBlockState getExtendedState(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    se.gory_moon.horsepower.tileentity.TileEntityHPBase tile = getTileEntity(world, pos);
    if (tile == null)
        return state;
    
    return state.withProperty(se.gory_moon.horsepower.blocks.BlockChopper.FACING, tile.getForward()).withProperty(se.gory_moon.horsepower.blocks.BlockChopper.PART, state.getValue(se.gory_moon.horsepower.blocks.BlockChopper.PART));
}