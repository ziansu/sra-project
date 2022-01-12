@java.lang.Override
public void readFromNBT(@org.jetbrains.annotations.NotNull
final net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    final net.minecraft.nbt.NBTTagList neededResTagList = compound.getTagList(com.minecolonies.coremod.colony.buildings.BuildingBuilder.TAG_RESOURCE_LIST, Constants.NBT.TAG_COMPOUND);
    for (int i = 0; i < (neededResTagList.tagCount()); ++i) {
        final net.minecraft.nbt.NBTTagCompound neededRes = neededResTagList.getCompoundTagAt(i);
        final net.minecraft.block.state.IBlockState state = net.minecraft.nbt.NBTUtil.readBlockState(neededRes);
        final int amount = neededRes.getInteger(com.minecolonies.coremod.colony.buildings.BuildingBuilder.TAG_AMOUNT);
        neededResources.put(state.getBlock(), amount);
    }
}