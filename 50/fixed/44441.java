public static org.bukkit.inventory.ItemStack getItem(java.lang.String itemKey) {
    if (itemKey == null)
        return null;
    
    return me.becja10.CoinExchange.Utils.ItemManager.config.getItemStack(itemKey, null);
}