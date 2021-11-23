public final net.minecraft.nbt.NBTTagCompound getSpellTag(net.minecraft.item.ItemStack par1ItemStack) {
    if (par1ItemStack == null)
        return null;
    
    net.minecraft.nbt.NBTTagCompound nbtt = par1ItemStack.getTagCompound();
    if ((nbtt != null) && (nbtt.hasKey("spell")))
        return ((net.minecraft.nbt.NBTTagCompound) (nbtt.getTag("spell")));
    
    return null;
}