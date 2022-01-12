public static void Init(com.gmail.jpk.stu.AmulyzeRPG.AmulyzeRPG plugin) {
    org.bukkit.Server server = plugin.getServer();
    server.getLogger().info("*****Registering Recipes*****");
    server.getLogger().info("Creating Item: ISwordA");
    com.gmail.jpk.stu.Recipes.CustomItem ISwordA = new com.gmail.jpk.stu.Recipes.CustomItem(new org.bukkit.inventory.ItemStack(org.bukkit.Material.DIAMOND_SWORD), "Sword A", "This is Sword A", "This is a test Sword.", "Please disregard");
    org.bukkit.inventory.ShapedRecipe ISwoardA_recipe = ISwordA.createShapedRecipe(" D .DDD. D ").setIngredient('D', Material.DIAMOND);
    plugin.getServer().addRecipe(ISwoardA_recipe);
}