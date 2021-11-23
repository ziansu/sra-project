public net.minecraft.item.ItemStack extract(int amount) {
    net.malisis.core.util.ItemUtils.ItemStackSplitter iss = new net.malisis.core.util.ItemUtils.ItemStackSplitter(getItemStack());
    iss.split(amount);
    setItemStack(iss.source);
    if (hasChanged())
        onSlotChanged();
    
    return iss.split;
}