@javax.annotation.Nonnull
@java.lang.Override
public final net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound compound) {
    net.minecraft.nbt.NBTTagCompound newCompound = super.writeToNBT(compound);
    newCompound.setBoolean("Redstone", this.isRedstonePowered);
    this.writeSyncableNBT(newCompound, false);
    return newCompound;
}