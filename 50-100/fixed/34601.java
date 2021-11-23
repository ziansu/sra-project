private void removeRecipe(org.bukkit.inventory.Recipe removalRecipe) {
    java.util.Iterator<org.bukkit.inventory.Recipe> itterator = getServer().recipeIterator();
    while (itterator.hasNext()) {
        org.bukkit.inventory.Recipe recipe = itterator.next();
        if (recipe.getResult().equals(removalRecipe.getResult())) {
            itterator.remove();
        }
    } 
}