@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.writeToNBT(tagCompound);
    if ((powerLevel) > 0) {
        tagCompound.setByte("powered", ((byte) (powerLevel)));
    }
    writeRestorableToNBT(tagCompound);
    return tagCompound;
}