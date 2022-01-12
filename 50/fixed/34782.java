@java.lang.Override
public net.minecraft.block.state.IBlockState onBlockPlaced(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.util.EnumFacing facing, float hitX, float hitY, float hitZ, int meta, net.minecraft.entity.EntityLivingBase placer) {
    return getDefaultState().withProperty(tobyo.tobyomod.block.BlockLaserCutter.FACING, placer.getHorizontalFacing());
}