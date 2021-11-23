@java.lang.Override
public int quantityDropped(net.minecraft.block.state.IBlockState state, int fortune, java.util.Random random) {
    return (random.nextInt(maxQuantityDropped)) + fortune;
}