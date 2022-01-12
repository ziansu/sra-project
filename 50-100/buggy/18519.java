@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound nbt) {
    int length = nbt.getInteger("length");
    for (int i = 0; i < length; i++) {
        prototypes.add((nbt.hasKey(("pro" + i)) ? com.Da_Technomancer.crossroads.API.technomancy.PrototypeInfo.readFromNBT(nbt.getCompoundTag(("pro" + i))) : null));
    }
    java.lang.System.out.println("READ_FROM");
}