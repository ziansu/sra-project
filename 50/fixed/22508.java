public static net.minecraft.nbt.NBTTagCompound getEntityData(java.lang.String name) {
    if ((mod.iridescent.proxy.ServerProxy.extendedEntityData.get(name)) != null) {
        return mod.iridescent.proxy.ServerProxy.extendedEntityData.remove(name);
    }else {
        return null;
    }
}