@java.lang.Override
public boolean onBlockActivated(net.minecraft.world.World world, net.minecraft.util.math.BlockPos blockPos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.EnumHand hand, net.minecraft.item.ItemStack heldItem, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    if (!(world.isRemote)) {
        player.openGui(MechaTech.INSTANCE, 0, world, blockPos.getX(), blockPos.getY(), blockPos.getZ());
        return true;
    }
    return false;
}