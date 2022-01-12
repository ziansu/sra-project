public java.util.ArrayList<com.izik.recipebook.Recipe> setRecipesFromAllUsers() {
    java.util.ArrayList<com.izik.recipebook.Recipe> allRecipes = com.izik.recipebook.Model.instance(mContext).GetAllUsersRecipes();
    mThumbIds = GetAllImagesFromArrayList(allRecipes);
    return allRecipes;
}