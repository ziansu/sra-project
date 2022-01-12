public boolean updateRecipe(java.lang.String name, java.util.ArrayList<java.lang.Object[]> ingInfo, int price, int id) {
    if (setUp()) {
        try {
            java.sql.PreparedStatement prep = getConnection().prepareStatement(deleteRecipe);
            prep.setInt(1, id);
            prep.executeUpdate();
            addGroceryRecipe(name, ingInfo, price);
        } catch (java.lang.Exception e) {
            java.lang.System.err.println("Issue with editing recipe.");
            return false;
        }
    }
    return true;
}