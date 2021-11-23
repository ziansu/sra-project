public static void setDimletKey(com.mcjty.rftools.items.dimlets.DimletKey key, net.minecraft.item.ItemStack itemStack) {
    net.minecraft.nbt.NBTTagCompound tagCompound = new net.minecraft.nbt.NBTTagCompound();
    tagCompound.setString("ktype", key.getType().dimletType.getOpcode());
    tagCompound.setString("dkey", key.getName());
    itemStack.setTagCompound(tagCompound);
    com.mcjty.rftools.items.dimlets.DimletMapping mapping = com.mcjty.rftools.items.dimlets.DimletMapping.getInstance();
    itemStack.setItemDamage(mapping.getId(key));
}