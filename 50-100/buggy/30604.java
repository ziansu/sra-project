public void removeRecipeList(int index, int ID) {
    try {
        java.sql.Connection conn = java.sql.DriverManager.getConnection(url, system.dbManager.username, system.dbManager.password);
        java.sql.Statement s = conn.createStatement();
        java.lang.String query = ((("DELETE FROM inventory_recipe WHERE recipeID='" + index) + "'AND inventoryID='") + ID) + "'";
        s.execute(query);
        logs.writeLogs("DELETED", "Inventory_recipe");
        s.close();
        conn.close();
    } catch (java.sql.SQLException exp) {
    }
}