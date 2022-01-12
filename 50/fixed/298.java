public void onBlockClicked(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.entity.player.EntityPlayer playerIn) {
    onLeftClicked(worldIn, pos, worldIn.getBlockState(pos), playerIn);
}