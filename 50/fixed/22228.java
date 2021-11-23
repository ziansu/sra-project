public void addUnsafeEnchantments(java.util.Map<org.bukkit.enchantments.Enchantment, java.lang.Integer> enchantments) {
    for (java.util.Map.Entry<org.bukkit.enchantments.Enchantment, java.lang.Integer> entry : enchantments.entrySet()) {
        addUnsafeEnchantment(entry.getKey(), entry.getValue());
    }
}