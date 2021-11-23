public static void setNBTString(org.bukkit.inventory.meta.ItemMeta meta, java.lang.String key, java.lang.String value) {
    try {
        java.lang.Object tag = me.yamakaja.commanditems.util.NMSUtil.nbtTagCompound.newInstance();
        me.yamakaja.commanditems.util.NMSUtil.setString.invoke(tag, key, value);
        ((java.util.Map<java.lang.String, java.lang.Object>) (me.yamakaja.commanditems.util.NMSUtil.unhandledTagsField.get(meta))).put(me.yamakaja.commanditems.util.NMSUtil.NBT_KEY, tag);
    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException | java.lang.InstantiationException e) {
        e.printStackTrace();
    }
}