@java.lang.Override
public void onNeighborBlockChange(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.block.Block neighborBlock) {
    for (net.minecraft.util.BlockPos target : targets) {
        if (target != null) {
            net.minecraft.block.state.IBlockState targetState = worldObj.getBlockState(target);
            targetState.getBlock().onNeighborBlockChange(worldObj, target, targetState, neighborBlock);
            worldObj.notifyNeighborsOfStateChange(target, targetState.getBlock());
        }
    }
}