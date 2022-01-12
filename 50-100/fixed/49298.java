public static int getNextEnchantmentID() {
    for (int possibleID = 0; possibleID < (Enchantment.enchantmentsList.length); possibleID++) {
        if (((net.minecraft.enchantment.Enchantment.enchantmentsList[possibleID]) == null) && (!(net.darkhax.bookshelf.lib.util.MathsUtils.foundEnchantments.contains(possibleID)))) {
            net.darkhax.bookshelf.lib.util.MathsUtils.foundEnchantments.add(possibleID);
            return possibleID;
        }
    }
    throw new java.lang.RuntimeException("An attempt to find an available enchantment ID was made, however no IDs are available.");
}