public java.lang.String getBaseItemDisplayName(net.minecraft.item.ItemStack stack) {
    if (stack.hasDisplayName()) {
        java.lang.String name = stack.getTagCompound().getCompoundTag("display").getString("Name");
        return ((TextFormatting.ITALIC.toString()) + name) + (TextFormatting.RESET.toString());
    }
    return super.getItemStackDisplayName(stack);
}