@java.lang.Override
public boolean onBlockActivated(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.util.EnumHand hand, net.minecraft.item.ItemStack heldItem, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    playChord(worldIn, pos);
    return true;
}