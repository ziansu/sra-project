@java.lang.Override
public void updateTick(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state, java.util.Random rand) {
    if (((rand.nextInt(16)) == 0) && (canGrow(worldIn, pos, state))) {
        grow(worldIn, rand, pos, state);
    }
}