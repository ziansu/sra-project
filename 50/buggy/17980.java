@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    super.readFromNBT(nbt);
    this.cutTime = nbt.getInteger("CutTime");
    this.handler.deserializeNBT(nbt.getCompoundTag("ItemStackHandler"));
}