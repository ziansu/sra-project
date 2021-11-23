public java.lang.String getBaseItemDisplayName(net.minecraft.item.ItemStack stack) {
    if ((stack.hasDisplayName()) == true) {
        net.minecraft.nbt.NBTTagCompound tag = stack.getTagCompound().getCompoundTag("display");
        return ((TextFormatting.ITALIC.toString()) + (tag.getString("Name"))) + (TextFormatting.RESET.toString());
    }
    return super.getItemStackDisplayName(stack);
}