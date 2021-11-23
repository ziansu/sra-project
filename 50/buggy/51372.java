final void setNBTFinal(net.minecraft.nbt.NBTTagCompound tag) {
    state = cn.academy.ability.api.ctrl.SyncAction.State.valueOf(tag.getString(cn.academy.ability.api.ctrl.SyncAction.NBT_STATE));
    if (tag.hasKey(cn.academy.ability.api.ctrl.SyncAction.NBT_OBJECT))
        readNBTFinal(tag.getCompoundTag(cn.academy.ability.api.ctrl.SyncAction.NBT_OBJECT));
    
}