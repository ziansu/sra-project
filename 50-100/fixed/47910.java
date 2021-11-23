public boolean deleteRecipe(edu.towson.cis.cosc442.project4.coffeemaker.Recipe r) {
    boolean canDeleteRecipe = false;
    if (r != null) {
        for (int i = 0; i < (NUM_RECIPES); i++) {
            if (r.equals(recipeArray[i])) {
                recipeArray[i] = this.recipeArray[i];
                canDeleteRecipe = true;
            }
        }
    }
    return canDeleteRecipe;
}