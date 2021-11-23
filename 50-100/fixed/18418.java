@java.lang.Override
public net.minecraft.nbt.NBTTagCompound getUpdateTag() {
    net.minecraft.nbt.NBTTagCompound nbt = super.getUpdateTag();
    if ((col) != null) {
        nbt.setInteger("col", ((col.getRGB()) & 16777215));
    }
    nbt.setInteger("reach", reach);
    nbt.setInteger("size", ((size) + 1));
    return nbt;
}