@java.lang.Override
public boolean onItemUse(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    worldIn.getChunkFromBlockCoords(pos).setBlockState(pos, Darkness.lightBlock.getDefaultState());
    return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
}