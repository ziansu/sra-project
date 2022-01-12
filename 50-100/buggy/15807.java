public boolean isLimitedBlock(net.minecraft.item.ItemStack itemStackA) {
    net.minecraft.item.ItemStack itemStackB = this.getItemStack();
    if ((itemStackA.getItem().equals(itemStackB.getItem())) && ((itemStackA.getItemDamage()) == (itemStackB.getItemDamage()))) {
        return true;
    }else {
        return false;
    }
}