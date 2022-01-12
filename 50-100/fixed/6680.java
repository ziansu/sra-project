@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound nbtTagCompound) {
    if (nbtTagCompound.hasKey(Names.NBT.SOURCES)) {
        net.minecraft.nbt.NBTTagList list = nbtTagCompound.getTagList(Names.NBT.SOURCES, Constants.NBT.TAG_INT_ARRAY);
        for (int i = 0; i < (list.tagCount()); i++) {
            sources.add(de.keridos.floodlights.util.GeneralUtil.getPosFromIntArray(list.getIntArrayAt(i)));
        }
    }
}