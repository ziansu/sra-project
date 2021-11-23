@java.lang.Override
public io.darkcraft.darkcore.mod.handlers.containers.PlayerContainer fillFromNBT(net.minecraft.nbt.NBTTagCompound nbt, java.lang.Object t) {
    java.util.UUID uuid = BasicMappers.uuidMapper.readFromNBT(nbt, "uuid");
    if ((t == null) || (!(((io.darkcraft.darkcore.mod.handlers.containers.PlayerContainer) (t)).getUUID().equals(uuid))))
        return createFromNBT(nbt);
    
    return ((io.darkcraft.darkcore.mod.handlers.containers.PlayerContainer) (t));
}