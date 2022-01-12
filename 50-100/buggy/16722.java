@java.lang.Override
public void updateTick(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state, java.util.Random rand) {
    if ((canGrow(worldIn, pos, state, (!(worldIn.isRemote)))) && (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, pos, state, ((rand.nextInt(16)) == 0)))) {
        grow(worldIn, rand, pos, state);
        net.minecraftforge.common.ForgeHooks.onCropsGrowPost(worldIn, pos, state, worldIn.getBlockState(pos));
    }
}