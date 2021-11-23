@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound dataTag) {
    super.writeToNBT(dataTag);
    this.writeNBT(dataTag);
    return dataTag;
}