final void setNBTFinal(net.minecraft.nbt.NBTTagCompound tag) {
    if (tag.hasKey(cn.academy.ability.api.ctrl.SyncAction.NBT_OBJECT))
        readNBTFinal(tag.getCompoundTag(cn.academy.ability.api.ctrl.SyncAction.NBT_OBJECT));
    
}