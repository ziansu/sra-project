@java.lang.Override
public void loadNBTData(net.minecraft.nbt.NBTTagCompound compound) {
    net.minecraft.nbt.NBTTagCompound properties = ((net.minecraft.nbt.NBTTagCompound) (compound.getTag(mod.iridescent.properties.IridescentMiningProperties.MINING_PROP_NAME)));
    miningLevel = properties.getInteger("Level");
    currentExp = properties.getInteger("CurrentExp");
    maxExp = properties.getInteger("MaxExp");
    printMiningDetails();
}