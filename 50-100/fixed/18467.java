public void addRecipeIngredient(dk.fambagge.recipes.domain.Recipe recipe) {
    double amount = getIngredientAmount();
    dk.fambagge.recipes.domain.Measure measure = getIngredientMeasure();
    dk.fambagge.recipes.domain.RecipeIngredient recipeIngredient = new dk.fambagge.recipes.domain.RecipeIngredient(getIngredient(), amount, measure);
    if (isConvert()) {
        double convertAmount = recipeIngredient.getAmount(convertMeasure);
        recipeIngredient.setAmount(convertAmount);
        recipeIngredient.setMeasure(convertMeasure);
    }
    recipe.addIngredient(recipeIngredient);
    dk.fambagge.recipes.db.Database.saveOrUpdate(recipe);
}