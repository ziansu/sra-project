public static java.lang.String getNBTString(org.bukkit.inventory.meta.ItemMeta meta, java.lang.String key) {
    try {
        java.lang.Object tag = ((java.util.HashMap<java.lang.String, java.lang.Object>) (me.yamakaja.commanditems.util.NMSUtil.unhandledTagsField.get(meta))).get(me.yamakaja.commanditems.util.NMSUtil.NBT_KEY);
        if (tag == null)
            return null;
        
        return ((java.lang.String) (me.yamakaja.commanditems.util.NMSUtil.getString.invoke(tag, key)));
    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    }
    return null;
}