@java.lang.Override
public net.minecraft.nbt.NBTTagCompound serializeNBT() {
    final net.minecraft.nbt.NBTTagCompound dataTag = new net.minecraft.nbt.NBTTagCompound();
    dataTag.setLong("TeslaPower", this.stored);
    dataTag.setLong("TeslaCapacity", this.capacity);
    dataTag.setLong("TeslaInput", this.inputRate);
    return dataTag;
}