@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.readFromNBT(tagCompound);
    inventoryContents.readFromNBT(tagCompound.getCompoundTag("ContentsChest"));
    setOwnerUUID(new java.util.UUID(tagCompound.getLong("OwnerUUIDMost"), tagCompound.getLong("OwnerUUIDLeast")));
}