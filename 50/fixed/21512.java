public pl.edu.uj.gotowanko.controllers.recipes.builders.RecipeStepBuilder withPhotoUrl(java.lang.String photoUrl) {
    if ((photoUrl != null) && (photoUrl.trim().isEmpty()))
        recipeStep.setPhotoUrl(null);
    else
        recipeStep.setPhotoUrl(photoUrl);
    
    return this;
}