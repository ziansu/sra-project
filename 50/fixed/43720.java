public boolean isStackMaterial(org.bukkit.inventory.ItemStack item, org.bukkit.Material material) {
    if (item == null) {
        return false;
    }
    return (item.getType()) == material;
}