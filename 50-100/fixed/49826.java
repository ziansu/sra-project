public void removeInventory(int index) {
    try {
        conn = java.sql.DriverManager.getConnection(url, system.dbManager.username, system.dbManager.password);
        s = conn.createStatement();
        java.lang.String query = ("DELETE FROM inventory WHERE inventoryID='" + index) + "'";
        s.execute(query);
        logs.writeLogs("DELETED", "Inventory");
        s.close();
        conn.close();
    } catch (java.sql.SQLException exp) {
    }
}