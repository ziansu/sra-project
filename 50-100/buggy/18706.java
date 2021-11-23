private void setupSteps(com.anhhoang.picrust.data.models.RecipeModel recipeModel) {
    if (recipeModel != null) {
        this.steps = new java.util.ArrayList<com.anhhoang.picrust.data.models.RecipeItem>(recipeModel.steps);
        this.steps.add(0, new com.anhhoang.picrust.data.Ingredient(0, null, null, 0));
    }else {
        this.steps = null;
    }
}