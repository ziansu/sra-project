private java.util.List<java.lang.Integer> getRecipes() {
    java.util.ArrayList<java.lang.Integer> recipesList = new java.util.ArrayList<java.lang.Integer>();
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < (km.barsim.handler.AbstractSFSClientRequestHandler.MAX_RECIPES); i++) {
        int recipeId = random.nextInt(km.barsim.handler.AbstractSFSClientRequestHandler.MAX_ID);
        recipesList.add(recipeId);
    }
    return recipesList;
}