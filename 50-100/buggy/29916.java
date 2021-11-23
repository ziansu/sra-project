public java.util.ArrayList<edu.boun.cmpe451.group2.client.Recipe> getRecommendations(edu.boun.cmpe451.group2.client.User user) throws java.lang.Exception {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list = recipeDao.getRecommendations(user);
    java.util.ArrayList<edu.boun.cmpe451.group2.client.Recipe> recipes = new java.util.ArrayList<edu.boun.cmpe451.group2.client.Recipe>();
    for (java.util.Map<java.lang.String, java.lang.Object> row : list) {
        edu.boun.cmpe451.group2.client.Recipe r = getRecipe(java.lang.Long.parseLong(row.get("recipeID").toString()));
        recipes.add(r);
    }
    return recipes;
}