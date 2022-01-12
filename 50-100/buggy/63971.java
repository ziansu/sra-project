public static java.util.Vector<com.dangerducks.cookit.kitchen.Recipe> getRecipes(java.lang.String dir) {
    java.util.Vector<com.dangerducks.cookit.kitchen.Recipe> recipes = new java.util.Vector<com.dangerducks.cookit.kitchen.Recipe>();
    java.lang.String[] objects = com.dangerducks.cookit.utils.FileManager.openFolder(dir);
    com.dangerducks.cookit.kitchen.Recipe aux;
    for (java.lang.String name : objects) {
        aux = com.dangerducks.cookit.utils.FileManager.loadRecipe(name, dir);
        recipes.add(aux);
    }
    return recipes;
}