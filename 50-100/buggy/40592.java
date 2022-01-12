public boolean matches(net.minecraft.item.ItemStack stack) {
    if ((getDiscoveryItem()) != (stack.getItem()))
        return false;
    
    return ((getDiscoveryMeta()) & (getDiscoveryMetaFlags())) != ((stack.getItemDamage()) & (getDiscoveryMetaFlags()));
}