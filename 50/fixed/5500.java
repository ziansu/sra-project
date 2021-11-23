public net.minecraft.item.ItemStack getItem() {
    load(this.player);
    return handler.getStackInSlot(0);
}