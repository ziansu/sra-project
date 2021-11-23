public void writeToNBT(@org.jetbrains.annotations.NotNull
final net.minecraft.nbt.NBTTagCompound compound) {
    compound.setDouble(com.minecolonies.coremod.entity.ai.citizen.miner.Node.TAG_X, x);
    compound.setDouble(com.minecolonies.coremod.entity.ai.citizen.miner.Node.TAG_Z, z);
    compound.setString(com.minecolonies.coremod.entity.ai.citizen.miner.Node.TAG_STYLE, style.name());
    compound.setString(com.minecolonies.coremod.entity.ai.citizen.miner.Node.TAG_STATUS, status.name());
    if ((parent) != null) {
        compound.setDouble(com.minecolonies.coremod.entity.ai.citizen.miner.Node.TAG_PARENTX, parent.getX());
        compound.setDouble(com.minecolonies.coremod.entity.ai.citizen.miner.Node.TAG_PARENTZ, parent.getY());
    }
}