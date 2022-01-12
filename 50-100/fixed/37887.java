@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    nbt.setInteger("length", prototypes.size());
    int i = 0;
    for (com.Da_Technomancer.crossroads.API.technomancy.PrototypeInfo entry : prototypes) {
        if (entry != null) {
            nbt.setTag(("pro" + i), entry.writeToNBT(new net.minecraft.nbt.NBTTagCompound()));
        }
        i++;
    }
    return nbt;
}