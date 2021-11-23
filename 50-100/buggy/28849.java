@java.lang.Override
public void writeToNBT(@org.jetbrains.annotations.NotNull
final net.minecraft.nbt.NBTTagCompound compound) {
    @org.jetbrains.annotations.NotNull
    final net.minecraft.nbt.NBTTagList furnacesTagList = new net.minecraft.nbt.NBTTagList();
    for (@org.jetbrains.annotations.NotNull
    final net.minecraft.util.math.BlockPos entry : furnaces) {
        @org.jetbrains.annotations.NotNull
        final net.minecraft.nbt.NBTTagCompound furnaceCompound = new net.minecraft.nbt.NBTTagCompound();
        furnaceCompound.setTag(com.minecolonies.coremod.colony.buildings.BuildingCook.TAG_POS, net.minecraft.nbt.NBTUtil.createPosTag(entry));
        furnacesTagList.appendTag(furnaceCompound);
    }
    compound.setTag(com.minecolonies.coremod.colony.buildings.BuildingCook.TAG_FURNACES, furnacesTagList);
    compound.setBoolean(com.minecolonies.coremod.colony.buildings.BuildingCook.TAG_COOKING, isSomethingInOven);
}