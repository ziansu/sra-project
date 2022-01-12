@java.lang.Override
public io.darkcraft.darkcore.mod.handlers.containers.PlayerContainer fillFromNBT(net.minecraft.nbt.NBTTagCompound nbt, io.darkcraft.darkcore.mod.handlers.containers.PlayerContainer t) {
    java.util.UUID uuid = BasicMappers.uuidMapper.readFromNBT(nbt, "uuid");
    if ((t == null) || (!(t.getUUID().equals(uuid))))
        return createFromNBT(nbt);
    
    return t;
}