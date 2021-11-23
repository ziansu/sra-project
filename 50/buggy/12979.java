public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.writeToNBT(tag);
    tag.setBoolean(KEY_COOKING, isCooking);
    tag.setInteger(KEY_TIME, cookTime);
}