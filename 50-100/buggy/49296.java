public boolean shouldBeModified(org.bukkit.inventory.ItemStack item) {
    if (!(getConfig().getBoolean("use-list")))
        return true;
    
    if (item == null)
        return false;
    
    org.bukkit.Material type = item.getType();
    if (type == (org.bukkit.Material.AIR))
        return false;
    
    return (type != (org.bukkit.Material.AIR)) && (whitelist ? materials.contains(type) : !(materials.contains(type)));
}