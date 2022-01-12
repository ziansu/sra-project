public static net.minecraft.item.ItemStack getItemStackFromItemStack(net.minecraft.item.ItemStack holder, java.lang.String tag) {
    if (((holder != null) && (holder.hasTagCompound())) && ((holder.getTagCompound()) != null))
        return net.minecraft.item.ItemStack.loadItemStackFromNBT(holder.getTagCompound().getCompoundTag(tag));
    
    return null;
}