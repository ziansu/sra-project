public int getPrice(org.bukkit.enchantments.Enchantment ench, int level) {
    return config.getInt((((ench.getName().toLowerCase()) + ".level") + level));
}