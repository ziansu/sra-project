public boolean onDroppedByPlayer(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer player) {
    setGliding(stack, false);
    return super.onDroppedByPlayer(stack, player);
}