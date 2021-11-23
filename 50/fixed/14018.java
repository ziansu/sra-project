@java.lang.Override
public final void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    this.readSyncableNBT(compound, de.ellpeck.actuallyadditions.mod.tile.TileEntityBase.NBTType.SAVE_TILE);
}