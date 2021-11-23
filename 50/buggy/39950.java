@java.lang.Override
public void writeRestorableToNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    writeBufferToNBT(tagCompound, inventoryHelper);
    tagCompound.setInteger("liquid", crystalLiquid);
}