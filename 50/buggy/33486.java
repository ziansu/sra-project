@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.writeToNBT(tag);
    if ((getBlockMetadata()) < 2) {
        tag.setInteger("progress", progress);
        tag.setBoolean("isCooking", isCooking);
    }
}