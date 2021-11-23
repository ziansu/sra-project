private boolean isValid(org.bukkit.inventory.ItemStack itemStack) {
    return (itemStack != null) || (!(itemStack.getType().equals(Material.AIR)));
}