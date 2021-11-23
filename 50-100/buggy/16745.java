public static me.fanhua.uapi.utils.nbt.NBTTagCompound getNBT(org.bukkit.inventory.ItemStack item) {
    try {
        java.lang.Object object = me.fanhua.uapi.utils.item.ItemUtils.fieldTag.get(me.fanhua.uapi.utils.item.ItemUtils.getServerItem(item));
        if (object == null)
            return new me.fanhua.uapi.utils.nbt.NBTTagCompound();
        
        return ((me.fanhua.uapi.utils.nbt.NBTTagCompound) (me.fanhua.uapi.utils.nbt.NBTTag.create(object)));
    } catch (java.lang.Throwable error) {
        error.printStackTrace();
        return null;
    }
}