@java.lang.Override
public net.minecraft.util.ActionResult<net.minecraft.item.ItemStack> onItemRightClick(net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.EnumHand hand) {
    net.minecraft.item.ItemStack stack = player.getHeldItem(hand);
    if (world.isRemote) {
        return new net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>(net.minecraft.util.EnumActionResult.FAIL, stack);
    }
    net.minecraft.util.math.Vec3d releasePoint = this.getAirPositionInFrontOfPlayer(world, player, 0.8);
    this.releaseBug(stack, world, player, hand, releasePoint);
    return new net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>(net.minecraft.util.EnumActionResult.SUCCESS, stack);
}