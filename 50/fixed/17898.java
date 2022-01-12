public void getSubItems(net.minecraft.util.NonNullList<net.minecraft.item.ItemStack> subItems) {
    for (int i = 0; i < 16; i++) {
        subItems.add(new net.minecraft.item.ItemStack(this, 1, i));
    }
}