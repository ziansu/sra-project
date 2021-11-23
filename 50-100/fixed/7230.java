public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stack) {
    net.minecraft.nbt.NBTTagCompound tag = stack.getTagCompound();
    if (tag != null) {
        return ((super.getUnlocalizedName(stack)) + ".") + (tag.getString("name"));
    }else {
        return super.getUnlocalizedName(stack);
    }
}