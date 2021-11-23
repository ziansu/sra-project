@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.writeToNBT(tag);
    tag.setShort(Names.NBT.COUNTER, ((short) (counter)));
    if ((inventory) != null) {
        net.minecraft.nbt.NBTTagCompound invCompound = new net.minecraft.nbt.NBTTagCompound();
        inventory.writeToNBT(tag);
        tag.setTag(Names.NBT.ITEMS, invCompound);
    }
    writeSyncableData(tag);
}