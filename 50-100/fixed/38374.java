public static org.bukkit.inventory.meta.ItemMeta hideItemAttributes(org.bukkit.inventory.meta.ItemMeta meta) {
    if (!(fr.zcraft.zlib.tools.items.ItemUtils.addItemFlagLoaded))
        fr.zcraft.zlib.tools.items.ItemUtils.init();
    
    if ((fr.zcraft.zlib.tools.items.ItemUtils.addItemFlagsMethod) == null) {
        return meta;
    }
    try {
        fr.zcraft.zlib.tools.items.ItemUtils.addItemFlagsMethod.invoke(meta, new java.lang.Object[]{ fr.zcraft.zlib.tools.items.ItemUtils.itemFlagValues });
    } catch (java.lang.IllegalAccessException ex) {
        fr.zcraft.zlib.tools.PluginLogger.error("IllegalAccessException caught while invoking the ItemMeta.addItemFlags method.", ex);
    } catch (java.lang.reflect.InvocationTargetException ex) {
        fr.zcraft.zlib.tools.PluginLogger.error("Exception occurred while invoking the ItemMeta.addItemFlags method.", ex.getCause());
    }
    return meta;
}