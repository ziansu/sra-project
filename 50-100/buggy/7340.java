@java.lang.Override
public void readFromNBT(@org.jetbrains.annotations.NotNull
final net.minecraft.nbt.NBTTagCompound compound) {
    final net.minecraft.nbt.NBTTagList furnaceTagList = compound.getTagList(com.minecolonies.coremod.colony.buildings.BuildingCook.TAG_FURNACES, Constants.NBT.TAG_COMPOUND);
    for (int i = 0; i < (furnaceTagList.tagCount()); ++i) {
        furnaces.add(net.minecraft.nbt.NBTUtil.getPosFromTag(furnaceTagList.getCompoundTagAt(i).getCompoundTag(com.minecolonies.coremod.colony.buildings.BuildingCook.TAG_POS)));
    }
    isSomethingInOven = compound.getBoolean(com.minecolonies.coremod.colony.buildings.BuildingCook.TAG_COOKING);
}