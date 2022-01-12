protected void checkAndDropBlock(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state) {
    if (!(this.canBlockStay(worldIn, pos, state))) {
        this.dropBlockAsItem(worldIn, pos, state, 0);
        worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
    }
}