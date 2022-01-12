private void registerRecipe() {
    if (!(this.getConfig().getBoolean("enableTakeEnchantment"))) {
        for (org.bukkit.Material enchItem : func.getEnchantableMaterial()) {
            org.bukkit.inventory.ShapelessRecipe sr = new org.bukkit.inventory.ShapelessRecipe(new org.bukkit.inventory.ItemStack(org.bukkit.Material.ENCHANTED_BOOK, 1));
            sr.addIngredient(Material.BOOK);
            sr.addIngredient(Material.EXP_BOTTLE);
            sr.addIngredient(enchItem);
            this.getServer().addRecipe(sr);
        }
    }
}