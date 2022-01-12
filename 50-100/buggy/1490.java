public com.Ben12345rocks.AdvancedCore.Util.Item.ItemBuilder setSkullOwner(org.bukkit.OfflinePlayer offlinePlayer) {
    try {
        org.bukkit.inventory.meta.SkullMeta im = ((org.bukkit.inventory.meta.SkullMeta) (is.getItemMeta()));
        im.setOwningPlayer(offlinePlayer);
        is.setItemMeta(im);
    } catch (java.lang.ClassCastException expected) {
    }
    return this;
}