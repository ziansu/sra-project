public com.tealcube.minecraft.bukkit.hilt.HiltItemStack toItemStack(int min, int max) {
    com.tealcube.minecraft.bukkit.hilt.HiltItemStack hiltItemStack = new com.tealcube.minecraft.bukkit.hilt.HiltItemStack(material);
    hiltItemStack.setName(name);
    hiltItemStack.setLore(lore);
    hiltItemStack.addUnsafeEnchantments(enchantmentMap);
    hiltItemStack.setAmount(java.util.concurrent.ThreadLocalRandom.current().nextInt(min, (max + 1)));
    return hiltItemStack;
}