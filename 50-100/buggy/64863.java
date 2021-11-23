@java.lang.Override
public net.minecraft.util.ActionResult<net.minecraft.item.ItemStack> onItemRightClick(net.minecraft.item.ItemStack itemStackIn, net.minecraft.world.World worldIn, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.util.EnumHand hand) {
    if (!(worldIn.isRemote)) {
        playerIn.openGui(Chisel.instance, 0, worldIn, hand.ordinal(), 0, 0);
        return net.minecraft.util.ActionResult.newResult(EnumActionResult.SUCCESS, itemStackIn);
    }
    return net.minecraft.util.ActionResult.newResult(EnumActionResult.PASS, itemStackIn);
}