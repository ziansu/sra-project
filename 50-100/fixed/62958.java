@java.lang.Override
public net.minecraft.util.ActionResult<net.minecraft.item.ItemStack> onItemRightClick(net.minecraft.item.ItemStack itemStackIn, net.minecraft.world.World worldIn, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.util.EnumHand hand) {
    if ((getSlot(itemStackIn)) == (thut.wearables.EnumWearable.BACK)) {
        playerIn.openGui(ThutBling.instance, 0, worldIn, 0, 0, 0);
        return new net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>(net.minecraft.util.EnumActionResult.SUCCESS, itemStackIn);
    }
    return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
}