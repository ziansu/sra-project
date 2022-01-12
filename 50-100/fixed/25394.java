public java.util.List<de.tum.in.foodforme.model.UserIngredientPreference> setUserIngredientPreference(java.lang.String userId, java.util.List<java.lang.String> likeIngredients, java.util.List<java.lang.String> dislikeIngredients) {
    java.util.List<de.tum.in.foodforme.model.UserIngredientPreference> list = new java.util.ArrayList<de.tum.in.foodforme.model.UserIngredientPreference>();
    if (likeIngredients != null) {
        list.addAll(setUserIngredientPreference(userId, likeIngredients, true));
    }
    if (dislikeIngredients != null) {
        list.addAll(setUserIngredientPreference(userId, dislikeIngredients, false));
    }
    return list;
}