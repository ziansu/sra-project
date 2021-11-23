@java.lang.Override
public void create(edu.unl.csce361.group4.cookbook.User user) {
    java.lang.String sql = "INSERT INTO users (user_name, password, full_name) VALUES (?, ?, ?)";
    dataSource.update(sql, new java.lang.Object[]{ user.getUserName() , user.getFullName() });
    for (edu.unl.csce361.group4.cookbook.Recipe favs : user.getFavoriteRecipes()) {
        sql = "INSERT INTO favorite_recipes (user_id, recipe_id) VALUES (?, ?)";
        dataSource.update(sql, new java.lang.Object[]{ user.getUserId() , favs.getRecipeId() });
    }
}