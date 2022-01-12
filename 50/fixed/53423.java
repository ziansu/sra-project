public net.minecraft.util.math.AxisAlignedBB getBoundingBox(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess source, net.minecraft.util.math.BlockPos pos) {
    return goosezilla.greenpower.blocks.BlockGreenCarrots.GREENCARROT_AABB[state.getValue(this.getAgeProperty()).intValue()];
}