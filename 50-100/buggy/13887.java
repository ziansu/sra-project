void initializeProgram() {
    this.cookbook = new com.lockness.kitchen.Cookbook();
    java.io.File recipeFolder = new java.io.File("Recipe");
    java.io.File[] listOfRecipes = recipeFolder.listFiles();
    for (int i = 0; i < (listOfRecipes.length); i++) {
        com.lockness.kitchen.Recipe recipe = com.lockness.util.InputParser.parseRCP(listOfRecipes[i].getName());
        cookbook.addRecipe(recipe);
    }
}