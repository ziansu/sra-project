public static void deleteTerritory(java.sql.Statement myStmt, int territory_number) {
    try {
        myStmt.executeUpdate(SQLstatements.deleteTerritory(territory_number));
    } catch (java.sql.SQLException e) {
        AlertBox alertbox = new AlertBox();
        alertbox.display("Invalid Entry", e.toString());
        e.printStackTrace();
    }
}