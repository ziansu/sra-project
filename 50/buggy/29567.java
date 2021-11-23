public boolean onDroppedByPlayer(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer player) {
    com.httymd.item.ItemGlideArmor.setGliding(stack, false);
    return super.onDroppedByPlayer(stack, player);
}