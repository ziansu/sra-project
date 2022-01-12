@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    net.minecraft.nbt.NBTTagList tagList = new net.minecraft.nbt.NBTTagList();
    nbt.setTag(miguknamja.pollution.data.PollutionWorldData.DATA_NAME, tagList);
    for (java.util.Map.Entry<miguknamja.pollution.ChunkKey, miguknamja.pollution.data.PollutionDataValue> entry : hashMap.entrySet()) {
        java.lang.String key = entry.getKey().toString();
        java.lang.String value = entry.getValue().toString();
        tagList.appendTag(new net.minecraft.nbt.NBTTagString(key));
        tagList.appendTag(new net.minecraft.nbt.NBTTagString(value));
    }
    return nbt;
}