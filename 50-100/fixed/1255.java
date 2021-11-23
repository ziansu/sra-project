public boolean isValidOnSide(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.util.EnumFacing side) {
    if ((side == (net.minecraft.util.EnumFacing.UP)) || (side == (net.minecraft.util.EnumFacing.DOWN))) {
        return false;
    }
    return ((worldIn.getBlockState(pos.offset(side.getOpposite())).getBlock()) == (net.minecraft.init.Blocks.LOG)) || ((worldIn.getBlockState(pos.offset(side.getOpposite())).getBlock()) == (net.minecraft.init.Blocks.LOG2));
}