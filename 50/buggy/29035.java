public java.lang.Iterable<com.cookbook.domain.Recipe> getAllRecipes() {
    return recipeRepository.findAll();
}