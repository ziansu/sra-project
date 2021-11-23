public java.util.ArrayList<com.izik.recipebook.Recipe> SetRecipesImagesArrayForUser(java.lang.String id) {
    java.util.ArrayList<com.izik.recipebook.Recipe> userRecipes = com.izik.recipebook.Model.instance(mContext).GetAllUserRecipesByID(id);
    mThumbIds = GetAllImagesFromArrayList(userRecipes);
    return userRecipes;
}