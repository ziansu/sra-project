public void addSavedRecipe(int recipeID, int userID) {
    try {
        data.RecipediaJDBC.ps = data.RecipediaJDBC.conn.prepareStatement(data.RecipediaJDBC.addSavedRecipe);
        data.RecipediaJDBC.ps.setInt(1, userID);
        data.RecipediaJDBC.ps.setInt(2, recipeID);
        data.RecipediaJDBC.ps.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}