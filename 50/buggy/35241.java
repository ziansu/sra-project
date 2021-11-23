public static void registerEnchantments() {
    try {
        io.github.anon10w1z.craftPP.enchantments.CppEnchantments.enchantmentNames.stream().filter(io.github.anon10w1z.craftPP.handlers.CppConfigHandler.enchantmentNameToEnable::get).forEach(io.github.anon10w1z.craftPP.enchantments.CppEnchantments::instantiateEnchantment);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}