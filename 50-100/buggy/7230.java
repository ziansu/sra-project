public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stack) {
    net.minecraft.nbt.NBTTagCompound tag = stack.getTagCompound();
    if (tag != null) {
        return ((super.getUnlocalizedName(stack)) + ".") + (tag.getString("name"));
    }else {
        k4unl.minecraft.Hydraulicraft.lib.Log.error("Tag of a trolley itemstack was null??");
        return super.getUnlocalizedName(stack);
    }
}