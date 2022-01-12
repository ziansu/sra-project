public void storeRecipe(org.cook_e.data.Recipe r) throws java.sql.SQLException {
    java.lang.Integer id = getRecipeId(r);
    if (id == null) {
        id = (org.cook_e.data.StorageAccessor.recipe_counter)++;
        recipe_ids.put(new org.cook_e.data.Pair<java.lang.String, java.lang.String>(r.getTitle(), r.getAuthor()), id);
    }
    try {
        sqlite.storeRecipe(r, ((int) (id)));
    } catch (java.lang.Exception e) {
        throw new java.sql.SQLException(e);
    }
}