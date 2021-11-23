private void DeleteRcipe(com.izik.recipebook.Recipe recipe, int position) {
    User.getUserRecipes().remove(position);
    com.izik.recipebook.Model.instance(getApplication().getResources(), this).DeleteRecipe(recipe);
    imageAdapter.RefreshUserRecipesImagesList(User.getId());
    imageAdapter.notifyDataSetChanged();
}