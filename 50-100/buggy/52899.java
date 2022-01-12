@java.lang.Override
public void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    super.readEntityFromNBT(nbt);
    npc = NPC.REGISTRY.get(new net.minecraft.util.ResourceLocation(nbt.getString("NPC")));
    if (nbt.hasKey("Town")) {
        home = java.util.UUID.fromString("Town");
    }
}