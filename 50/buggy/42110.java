@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.readFromNBT(tag);
    if ((getBlockMetadata()) < 2) {
        progress = tag.getInteger("progress");
        isCooking = tag.getBoolean("isCooking");
    }
}