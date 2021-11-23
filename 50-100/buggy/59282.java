@java.lang.Override
public net.minecraft.util.ActionResult<net.minecraft.item.ItemStack> onItemRightClick(net.minecraft.item.ItemStack itemStackIn, net.minecraft.world.World worldIn, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.util.EnumHand hand) {
    net.minecraft.item.ItemStack existingStack = playerIn.getItemStackFromSlot(getEquipmentSlot());
    if (existingStack == null) {
        playerIn.setItemStackToSlot(getEquipmentSlot(), itemStackIn);
        (itemStackIn.stackSize)--;
        return new net.minecraft.util.ActionResult(net.minecraft.util.EnumActionResult.SUCCESS, itemStackIn);
    }
    return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
}