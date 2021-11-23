@java.lang.Override
public net.minecraft.util.ActionResult<net.minecraft.item.ItemStack> onItemRightClick(net.minecraft.world.World worldIn, net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.EnumHand hand) {
    net.minecraft.item.ItemStack heldItem = player.getHeldItem(hand);
    if (heldItem != (net.minecraft.item.ItemStack.EMPTY)) {
        if (com.legacy.aether.common.player.PlayerAether.get(player).accessories.setInventoryAccessory(heldItem.copy())) {
            heldItem.shrink(1);
            return new net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>(net.minecraft.util.EnumActionResult.SUCCESS, heldItem);
        }
    }
    return new net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>(net.minecraft.util.EnumActionResult.FAIL, heldItem);
}