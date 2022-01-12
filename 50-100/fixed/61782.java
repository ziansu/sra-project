@java.lang.Override
public net.minecraft.util.ActionResult<net.minecraft.item.ItemStack> onItemRightClick(net.minecraft.item.ItemStack itemStack, net.minecraft.world.World worldIn, net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.EnumHand hand) {
    if ((itemStack != null) && (com.legacy.aether.common.player.PlayerAether.get(player).accessories.setInventoryAccessory(itemStack.copy()))) {
        --(itemStack.stackSize);
        return new net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>(net.minecraft.util.EnumActionResult.SUCCESS, itemStack);
    }
    return new net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>(net.minecraft.util.EnumActionResult.FAIL, itemStack);
}