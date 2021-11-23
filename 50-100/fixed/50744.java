public void registerFurnaceRecipes() {
    org.bukkit.inventory.FurnaceRecipe splashPotions = new org.bukkit.inventory.FurnaceRecipe(new org.bukkit.inventory.ItemStack(org.bukkit.Material.BOOKSHELF), new org.bukkit.inventory.ItemStack(org.bukkit.Material.POTION, 1, ((short) (8229))).getData());
    plugin.getServer().addRecipe(splashPotions);
}