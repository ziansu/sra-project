public void onNeighborBlockChange(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.block.Block neighborBlock) {
    if ((this.target) != null) {
        net.minecraft.block.state.IBlockState targetState = worldIn.getBlockState(target);
        targetState.getBlock().onNeighborBlockChange(worldIn, target, targetState, neighborBlock);
        worldIn.notifyNeighborsOfStateChange(target, targetState.getBlock());
    }
}