@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.readFromNBT(tag);
    progress = tag.getInteger("progress");
    isCooking = tag.getBoolean("isCooking");
}