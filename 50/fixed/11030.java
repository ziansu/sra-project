@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.writeToNBT(tagCompound);
    tagCompound.setInteger("IonCount", force_lasers_ions);
}