@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound nbtTagCompound) {
    super.readFromNBT(nbtTagCompound);
    if (nbtTagCompound.hasKey(Names.NBT.SOURCES)) {
        net.minecraft.nbt.NBTTagList list = nbtTagCompound.getTagList(Names.NBT.SOURCES, Constants.NBT.TAG_INT_ARRAY);
        for (int i = 0; i < (list.tagCount()); i++) {
            sources.add(list.func_150306_c(i));
        }
    }
}