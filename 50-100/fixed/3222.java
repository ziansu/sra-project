public net.minecraft.item.ItemStack setItem(net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack item) {
    load(player);
    item.setCount(1);
    net.minecraft.item.ItemStack stack = handler.getStackInSlot(0);
    this.handler.setStackInSlot(0, item);
    this.save(this.player);
    return stack;
}