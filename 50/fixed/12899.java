@java.lang.Override
protected void updateState(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state) {
    int priority = -1;
    worldIn.updateBlockTick(pos, this, 0, priority);
}