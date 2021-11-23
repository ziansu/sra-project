public boolean onBlockDestroyed(net.minecraft.item.ItemStack stack, net.minecraft.world.World worldIn, net.minecraft.block.state.IBlockState blockIn, net.minecraft.util.math.BlockPos pos, net.minecraft.entity.EntityLivingBase entityLiving) {
    if (((double) (blockIn.getBlockHardness(worldIn, pos))) != 0.0) {
        stack.damageItem(1, entityLiving);
    }
    return true;
}