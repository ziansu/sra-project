@java.lang.Override
public net.minecraft.util.EnumActionResult onItemUse(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.util.EnumHand hand, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    if (world.isRemote)
        return net.minecraft.util.EnumActionResult.PASS;
    
    de.longor.talecraft.items.WandItem.applyWand(player, pos);
    return net.minecraft.util.EnumActionResult.SUCCESS;
}