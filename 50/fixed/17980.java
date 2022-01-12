@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    this.cutTime = nbt.getInteger("CutTime");
    this.handler.deserializeNBT(nbt.getCompoundTag("ItemStackHandler"));
    super.readFromNBT(nbt);
}