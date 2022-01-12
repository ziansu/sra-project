public static net.minecraft.util.math.Vec3d getFlowVec(net.minecraft.block.state.IBlockState blockState) {
    net.minecraft.util.EnumFacing dir = blockState.getValue(com.draco18s.ores.block.BlockSluice.FACING);
    return new net.minecraft.util.math.Vec3d(((dir.getFrontOffsetX()) * 2), 0, ((dir.getFrontOffsetZ()) * 2));
}