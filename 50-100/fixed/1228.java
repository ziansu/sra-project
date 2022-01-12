@java.lang.Override
public int getLightValue(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    net.minecraft.block.Block block = world.getBlockState(pos).getBlock();
    if (block != (this)) {
        return block.getLightValue(state, world, pos);
    }
    return super.getLightValue(state, world, pos);
}