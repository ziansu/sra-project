public void setIngredients(java.util.List<com.example.islameldesoky.bakingdesoky.businesslogic.Ingredient> ingredients) {
    com.orhanobut.hawk.Hawk.put(com.example.islameldesoky.bakingdesoky.utils.App.ARG_INGREDIENTS, getRecipes().get(position).getIngredients());
}