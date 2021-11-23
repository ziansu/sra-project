public static void deleteTerritory(java.sql.Statement myStmt, int territory_number, java.lang.String territory_name) {
    try {
        myStmt.executeUpdate(SQLstatements.deleteTerritory(territory_number, territory_name));
    } catch (java.sql.SQLException e) {
        AlertBox alertbox = new AlertBox();
        alertbox.display("Invalid Entry", e.toString());
        e.printStackTrace();
    }
}