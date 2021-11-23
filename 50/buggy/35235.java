public org.bukkit.enchantments.Enchantment getEnchantment(org.bukkit.entity.Player user, java.lang.String name) throws java.lang.Exception {
    org.bukkit.enchantments.Enchantment enchantment = bammerbom.ultimatecore.bukkit.resources.databases.EnchantmentDatabase.getByName(name);
    return enchantment;
}