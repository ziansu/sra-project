protected void checkAndDropBlock(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state) {
    if (!(canBlockStay(worldIn, pos, state))) {
        dropBlockAsItem(worldIn, pos, state, 0);
        worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
    }
}