@java.lang.Override
public boolean isNormalCube(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    return (boundingBox[0]) == (FULL_BLOCK_AABB);
}