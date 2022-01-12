@java.lang.Override
public void writeRestorableToNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.writeRestorableToNBT(tagCompound);
    writeBufferToNBT(tagCompound, inventoryHelper);
    tagCompound.setInteger("liquid", crystalLiquid);
}