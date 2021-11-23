@java.lang.Override
@javax.annotation.Nullable
public net.minecraft.util.math.AxisAlignedBB getCollisionBoundingBox(net.minecraft.block.state.IBlockState blockState, net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos) {
    int i = ((java.lang.Integer) (blockState.getValue(weather2.block.BlockSandLayer.LAYERS))).intValue();
    float f = 0.125F;
    net.minecraft.util.math.AxisAlignedBB axisalignedbb = blockState.getBoundingBox(worldIn, pos);
    return new net.minecraft.util.math.AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY, axisalignedbb.minZ, axisalignedbb.maxX, ((double) (((float) (i)) * 0.125F)), axisalignedbb.maxZ);
}