@java.lang.Override
public void read(net.minecraft.nbt.NBTTagCompound nbtTags) {
    if (nbtTags.getBoolean("sideDataStored")) {
        for (mekanism.api.transmitters.TransmissionType type : transmissions) {
            sideConfigs.set(type.ordinal(), nbtTags.getByteArray(("config" + (type.ordinal()))));
        }
    }
}