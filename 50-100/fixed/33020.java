@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound nbtTagCompound) {
    super.writeToNBT(nbtTagCompound);
    if (!(this.sources.isEmpty())) {
        net.minecraft.nbt.NBTTagList SourceList = new net.minecraft.nbt.NBTTagList();
        for (net.minecraft.util.BlockPos source : sources) {
            SourceList.appendTag(new net.minecraft.nbt.NBTTagIntArray(de.keridos.floodlights.util.GeneralUtil.getIntArrayFromPos(source)));
        }
        nbtTagCompound.setTag(Names.NBT.SOURCES, SourceList);
    }
}