public boolean memoryCardHasScaleFactor(net.minecraft.item.ItemStack cardStack) {
    net.minecraft.nbt.NBTTagCompound tag = fi.dy.masa.enderutilities.util.nbt.NBTUtils.getCompoundTag(cardStack, "PortalScaler", false);
    if ((((tag != null) && (tag.hasKey("scaleX", Constants.NBT.TAG_BYTE))) && (tag.hasKey("scaleY", Constants.NBT.TAG_BYTE))) && (tag.hasKey("scaleZ", Constants.NBT.TAG_BYTE))) {
        return true;
    }
    return false;
}