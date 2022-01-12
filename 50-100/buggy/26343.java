@java.lang.Override
public net.minecraft.block.state.IBlockState getStateForPlacement(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, com.jaquadro.minecraft.storagedrawers.block.EnumFacing facing, float hitX, float hitY, float hitZ, int meta, net.minecraft.entity.EntityLivingBase placer, net.minecraft.item.ItemStack stack) {
    if (com.jaquadro.minecraft.storagedrawers.block.BlockKeyButton.canPlaceBlock(world, pos, facing.getOpposite()))
        return getStateFromMeta(meta).withProperty(com.jaquadro.minecraft.storagedrawers.block.BlockKeyButton.FACING, facing).withProperty(com.jaquadro.minecraft.storagedrawers.block.BlockKeyButton.POWERED, false);
    
    return getStateFromMeta(meta).withProperty(com.jaquadro.minecraft.storagedrawers.block.BlockKeyButton.FACING, EnumFacing.DOWN).withProperty(com.jaquadro.minecraft.storagedrawers.block.BlockKeyButton.POWERED, false);
}