public void registerFurnaceRecipes() {
    org.bukkit.inventory.FurnaceRecipe splashPotions = new org.bukkit.inventory.FurnaceRecipe(new org.bukkit.inventory.ItemStack(org.bukkit.Material.BOOKSHELF), new org.bukkit.inventory.ItemStack(org.bukkit.Material.POTION, 1, ((short) (8229))).getData());
    org.bukkit.inventory.FurnaceRecipe test = new org.bukkit.inventory.FurnaceRecipe(com.gmail.gandalfphysicist.Utils.ItemStacks.heal2Potion(), com.gmail.gandalfphysicist.Utils.ItemStacks.map().getData());
    plugin.getServer().addRecipe(splashPotions);
    plugin.getServer().addRecipe(test);
}