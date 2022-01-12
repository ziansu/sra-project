public int getPrice(org.bukkit.enchantments.Enchantment ench, int level) {
    java.lang.String path = ((ench.getName().toLowerCase()) + ".level") + level;
    return config.getInt(path);
}